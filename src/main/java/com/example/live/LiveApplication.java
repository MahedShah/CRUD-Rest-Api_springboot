package com.example.live;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiveApplication {

	public static void main(String[] args) {
		system.out.println("HEllo world!");
		SpringApplication.run(LiveApplication.class, args);
	}

}
