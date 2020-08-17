package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		System.out.println("change-1");
		System.out.println("change-2");
		System.out.println("change-3");

		System.out.println("change-5");
		System.out.println("this is old-master");
		System.out.println("change-6");
	}

}
