package com.microservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
// this project will store all the common configuration for all the
// microservices and this itself will run on a seperate port
// by default a config server tries to fetch all the config data from a github
// repo but we'll change that and set it to get the config data from the project
// application.yaml file
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
