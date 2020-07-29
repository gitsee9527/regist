package com.homepage.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.homepage"})
public class TestRegisterLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRegisterLoginApplication.class, args);
	}

}
