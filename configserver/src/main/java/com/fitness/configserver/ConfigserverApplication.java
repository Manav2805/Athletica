package com.fitness.configserver;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("MONGODB_CONNECTION_STRING", dotenv.get("MONGODB_CONNECTION_STRING"));
		System.setProperty("MONGODB_DATABASE_AI", dotenv.get("MONGODB_DATABASE_AI"));
		System.setProperty("POSTGRESQL_CONNECTION_STRING", dotenv.get("POSTGRESQL_CONNECTION_STRING"));
		SpringApplication.run(ConfigserverApplication.class, args);
	}

}
