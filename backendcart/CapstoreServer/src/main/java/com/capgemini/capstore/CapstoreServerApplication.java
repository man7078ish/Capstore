package com.capgemini.capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EntityScan("com.capgemini.capstore.beans")
@ComponentScan("com.capgemini.capstore.services")
public class CapstoreServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreServerApplication.class, args);
	}

}
