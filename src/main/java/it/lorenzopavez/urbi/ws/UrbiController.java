package it.lorenzopavez.urbi.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.lorenzopavez.urbi.dto.VehicleDto;
import it.lorenzopavez.urbi.service.UrbiService;


@RestController
public class UrbiController {

    @Autowired
    ApplicationContext applicationContext;
    
    @Autowired
    UrbiService urbiService;
    
    @GetMapping(value = "/vehicles", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public List<VehicleDto> getVehicles(@RequestParam(value = "lat",required = true) double lat, @RequestParam(value = "lon", required=true) double lon,
    		@RequestParam(value = "radius",required=true) double radius) {
    	
    	List<VehicleDto> ret = urbiService.getVehicles(lat, lon, radius);
    	return ret;
    }
    
}
