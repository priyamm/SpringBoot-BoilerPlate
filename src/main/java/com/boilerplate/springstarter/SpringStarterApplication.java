package com.boilerplate.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages= {"com.boilerplate.springstarter.person", "com.boilerplate.springstarter.mosaic"})
public class SpringStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
	}
}
