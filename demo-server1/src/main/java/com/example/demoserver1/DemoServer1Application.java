package com.example.demoserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoServer1Application.class, args);
	}
}
