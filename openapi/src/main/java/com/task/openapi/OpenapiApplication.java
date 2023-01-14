package com.task.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
		basePackages = {
				"com.task.openapi.web",
				"org.openapitools",
				"com.task.openapi",
				"org.openapitools.configuration"
		}
)

public class OpenapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenapiApplication.class, args);
	}

}
