package it.lorenzopavez.urbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "it.lorenzopavez.urbi" })
public class UrbiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UrbiApplication.class); 

	}

	public static void main(String[] args) {
		SpringApplication.run(UrbiApplication.class, args);
	}

}
