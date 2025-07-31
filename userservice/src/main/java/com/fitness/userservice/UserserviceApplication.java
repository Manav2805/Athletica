package com.fitness.userservice;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("POSTGRESQL_CONNECTION_STRING", dotenv.get("POSTGRESQL_CONNECTION_STRING"));
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
