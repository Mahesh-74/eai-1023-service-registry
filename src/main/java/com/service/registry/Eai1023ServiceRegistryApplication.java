package com.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eai1023ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eai1023ServiceRegistryApplication.class, args);
	}

}
