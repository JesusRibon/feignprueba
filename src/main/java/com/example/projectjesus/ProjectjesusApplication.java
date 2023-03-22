package com.example.projectjesus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProjectjesusApplication {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8082);
		SpringApplication.run(ProjectjesusApplication.class, args);
	}

}
