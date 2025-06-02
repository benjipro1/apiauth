package com.api.apiauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.api.apiauth"})
public class ApiauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiauthApplication.class, args);
	}

}
