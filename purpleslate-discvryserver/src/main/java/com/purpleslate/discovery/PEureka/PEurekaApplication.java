package com.purpleslate.discovery.PEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PEurekaApplication.class, args);
	}

}

