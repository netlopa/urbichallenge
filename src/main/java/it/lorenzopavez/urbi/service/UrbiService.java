package it.lorenzopavez.urbi.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.lorenzopavez.urbi.dto.ProviderEnum;
import it.lorenzopavez.urbi.dto.VehicleDto;
import it.lorenzopavez.urbi.entities.cityscoot.CityscootResponse;
import it.lorenzopavez.urbi.entities.enjoy.EnjoyResponse;

@Component
public class UrbiService {
	
	private static final Logger logger = LogManager.getLogger(UrbiService.class);
	
	@Autowired
	EnjoyService enjoyService;
	
	@Autowired
	CityscootService cityscootService;
	
	public List<VehicleDto> getVehicles(double lat, double lon,double radius) {
		CompletableFuture<EnjoyResponse> enjoyResults = enjoyService.getAllCars();
		CompletableFuture<CityscootResponse> cityScootResults = cityscootService.getAllScooters();
		
		EnjoyResponse enjoyResp = null;
		try {
			enjoyResp = enjoyResults.get(2, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			logger.error(e);
		}
		
		CityscootResponse cityscootResp = null;
		try {
			cityscootResp = cityScootResults.get(2, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			logger.error(e);
		}
		
		List<VehicleDto> ret = new ArrayList<VehicleDto>();
		if (enjoyResp != null) {
			if (Boolean.TRUE.equals(enjoyResp.getStatusFlag())) {
				enjoyResp.getReturn().getCarsAvailabilityData().forEach(carAvailData -> {
					carAvailData.getCarData().forEach(carData -> {
						//I need to continue only if the distance is less or equal than the radius set
						double dist = org.apache.lucene.util.SloppyMath.haversinMeters(lat, lon, 
								carData.getLocationData().getLat(), carData.getLocationData().getLon());
						if (radius == 0 || dist <= radius) {
							VehicleDto vehicle = new VehicleDto();
							vehicle.setDistance((int)dist);
							vehicle.setLat(carData.getLocationData().getLat());
							vehicle.setLon(carData.getLocationData().getLon());
							vehicle.setPlate(carData.getCarPlate());
							vehicle.setProvider(ProviderEnum.ENJOY);
							vehicle.setName(carData.getCarName());
							vehicle.setIdentifier(carData.getCarIdentifier());
							vehicle.setFuelLevel(carData.getFuelLevel());
							vehicle.setAddress(carData.getLocationData().getAddress());
							ret.add(vehicle);
						}
					});
				});
			}
		}
		
		if (cityscootResp != null) {
			if (Boolean.TRUE.equals(cityscootResp.getSuccess())) {
				Map<Integer, String> mapScooterType = cityscootResp.getData().getArtworks().stream().collect(Collectors.toMap(item -> item.getIdScooterArtwork(), item -> item.getName()));
				cityscootResp.getData().getScooters().forEach(data -> {
					//I need to continue only if the distance is less or equal than the radius set
					double dist = org.apache.lucene.util.SloppyMath.haversinMeters(lat, lon, 
							data.getLatitude(), data.getLongitude());
					
					if (radius == 0 || dist <= radius) {
						VehicleDto vehicle = new VehicleDto();
						vehicle.setDistance((int)dist);
						vehicle.setLat(data.getLatitude());
						vehicle.setLon(data.getLongitude());
						vehicle.setPlate(data.getPlate());
						vehicle.setProvider(ProviderEnum.CITYSCOOT);
						vehicle.setName(mapScooterType.get(data.getIdScooterArtwork()));
						vehicle.setIdentifier(data.getName());
						vehicle.setFuelLevel(data.getBattery());
						vehicle.setAddress(data.getGeocoding());
						ret.add(vehicle);
					}
					
				});
			}
		}
		
		//Now I should order the list from the closer to the further vehicle
		ret.sort(Comparator.comparingInt(VehicleDto::getDistance));
		
		return ret;
		
	}
	

	

}
