package com.example.Rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class RentalApplication {



	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		SpringApplication.run(RentalApplication.class, args);
	}

}
