package com.example.democlient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class DemoClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoClient2Application.class, args);
	}
}
