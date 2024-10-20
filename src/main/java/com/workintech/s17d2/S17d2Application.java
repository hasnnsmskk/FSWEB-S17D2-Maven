package com.workintech.s17d2;

import com.workintech.s17d2.tax.DeveloperTax;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class S17d2Application {

	public static void main(String[] args) {
		SpringApplication.run(S17d2Application.class, args);
	}

	@Bean
	public DeveloperTax developerTax() {
		return new DeveloperTax();
	}
}
