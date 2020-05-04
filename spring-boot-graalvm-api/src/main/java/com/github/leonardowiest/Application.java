package com.github.leonardowiest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false, scanBasePackages = { "com.github.leonardowiest.api" })
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
