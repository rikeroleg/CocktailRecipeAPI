package com.apicocktail.cocktail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CocktailApplication {
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
//		return restTemplateBuilder.build();
//	}

	public static void main(String args[]) {
		SpringApplication.run(CocktailApplication.class, args);
	}
}