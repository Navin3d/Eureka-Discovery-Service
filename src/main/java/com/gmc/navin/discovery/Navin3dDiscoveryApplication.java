package com.gmc.navin.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Navin3dDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Navin3dDiscoveryApplication.class, args);
	}

}
