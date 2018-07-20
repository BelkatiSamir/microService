package org.sid.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.sid.web.EtudiantRestService;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 @Configuration
 public class MyConfig {
 
	 //@Bean
	 public ResourceConfig getJersey() {
		 ResourceConfig config = new ResourceConfig();
		 config.register(EtudiantRestService.class);
		return config; 
	 }
	 
	 
	 
 }
