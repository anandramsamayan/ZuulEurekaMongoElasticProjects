package com.purpleslatelogdev.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableFeignClients
public class ElasticUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticUserApplication.class, args);
	}
}
