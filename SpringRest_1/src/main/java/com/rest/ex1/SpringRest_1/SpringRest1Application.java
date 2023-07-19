package com.rest.ex1.SpringRest_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRest1Application.class, args);
	}
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
