package com.sathyatel.plandetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class MicroSericePlanDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroSericePlanDetailsApplication.class, args);
	}

}
