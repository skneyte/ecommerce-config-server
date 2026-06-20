package com.ecommerce.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {

		System.out.println("GITHUB_USER=" + System.getenv("GITHUB_USER"));
		System.out.println("GITHUB_TOKEN_EXISTS=" + (System.getenv("GITHUB_TOKEN") != null));

		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
