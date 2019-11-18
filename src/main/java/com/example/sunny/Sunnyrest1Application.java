package com.example.sunny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.sunny.rest")
public class Sunnyrest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sunnyrest1Application.class, args);
	}

}
