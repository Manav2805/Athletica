package com.fitness.aiservice;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiserviceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("MONGODB_CONNECTION_STRING", dotenv.get("MONGODB_CONNECTION_STRING"));
		System.setProperty("MONGODB_DATABASE_AI", dotenv.get("MONGODB_DATABASE_AI"));
		SpringApplication.run(AiserviceApplication.class, args);
	}

}
