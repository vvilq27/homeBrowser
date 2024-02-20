package com.example.olxSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.olxSearch", "com.example.olxSearch.mapper"})
public class OlxSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxSearchApplication.class, args);
	}

}
