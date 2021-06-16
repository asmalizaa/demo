package com.example.demo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);

		// change apache tomcat port
		SpringApplication app = new SpringApplication(ConfigurationApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8088"));
		app.run(args);
	}

	// lambda expression - syntax to define anonymous function
	@Bean
	ApplicationRunner applicationRunner(Environment environment) {
		return args -> {
			System.out.println("message from application.properties "
					+ environment.getProperty("message-from-application-properties"));
			System.out.println("Hello everyone, " + environment.getProperty("greeting"));
		};
	}

}
