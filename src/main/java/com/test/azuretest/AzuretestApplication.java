package com.test.azuretest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuretestApplication {
	
	@GetMapping ("/message")
	public String message() {
	     return "Hello world Git hub actions testing v4";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzuretestApplication.class, args);
	}

}
