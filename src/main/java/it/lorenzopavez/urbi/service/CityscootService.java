package it.lorenzopavez.urbi.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.google.gson.Gson;

import it.lorenzopavez.urbi.entities.cityscoot.CityscootResponse;

@Service
public class CityscootService {
	
	private static final Logger logger = LogManager.getLogger(CityscootService.class);

	@Async
	public CompletableFuture<CityscootResponse> getAllScooters() {
		Gson gson = new Gson();
		
		try {
            File file = ResourceUtils.getFile("classpath:cityscoot.json");
            InputStream in = new FileInputStream(file);
            
            String text = new BufferedReader(
            	      new InputStreamReader(in, StandardCharsets.UTF_8))
            	        .lines()
            	        .collect(Collectors.joining("\n"));
            
            CityscootResponse ret = gson.fromJson(text, CityscootResponse.class);
            return CompletableFuture.completedFuture(ret);
            
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
		
		return null;
	}
	
}
