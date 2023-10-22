package com.dbmsproj.rentabike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentabikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentabikeApplication.class, args);
		System.out.println("Hello, World!");
		final int x = 3;
		System.out.println(x);
	}
}
