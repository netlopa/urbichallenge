package it.lorenzopavez.urbi;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.lorenzopavez.urbi.dto.VehicleDto;
import it.lorenzopavez.urbi.service.UrbiService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UrbiApplicationTests {

	@Autowired
	UrbiService urbiService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void shouldContainsOneEntry() {
		double lat=45.4486;
		double lon=9.1204605;
		List<VehicleDto> vehicles = urbiService.getVehicles(lat,lon, 1);
		assert vehicles.size() == 1;
		assert vehicles.get(0).getLat() == lat;
		assert vehicles.get(0).getLon() == lon;
	}
	
	@Test
	public void shouldBeOrderedByDistanceAndLessOrEqualThanDefinedDistance() {
		double lat=45.4486;
		double lon=9.1204605;
		double radius=1000;
		List<VehicleDto> vehicles = urbiService.getVehicles(lat,lon, radius);
		Integer distance=-1;
		for (VehicleDto dto: vehicles) {
			if (!(dto.getDistance() >= distance && dto.getDistance()<= radius)) {
				assert false;
			}
			distance = dto.getDistance();
		}
	}
	

}
