package com.sathyatel.customedetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RefreshScope
public class MicroServiceCustomerDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCustomerDetailsApplication.class, args);
	}

	
	@Bean
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
	
}
