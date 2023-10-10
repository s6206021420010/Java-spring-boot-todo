package com.example.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Day1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day1Application.class, args);
	}

}
