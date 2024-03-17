package com.auth.authenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthenserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenserviceApplication.class, args);
	}

}
