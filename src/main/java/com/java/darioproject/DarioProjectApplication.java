package com.java.darioproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "com.java.darioproject.repository", "com.java.darioproject.controller", "com.java.darioproject.service" })
public class DarioProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarioProjectApplication.class, args);

	}



}
