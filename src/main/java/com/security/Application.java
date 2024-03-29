package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages={"com.security"}) 
@EnableJpaRepositories(basePackages = "com.security.repository")
@EntityScan("com.security.dao.entity") 
@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}