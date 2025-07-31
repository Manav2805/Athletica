package com.fitness.activityservice;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivityserviceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("MONGODB_CONNECTION_STRING", dotenv.get("MONGODB_CONNECTION_STRING"));
		System.setProperty("MONGODB_DATABASE", dotenv.get("MONGODB_DATABASE"));
		SpringApplication.run(ActivityserviceApplication.class, args);
	}
}
