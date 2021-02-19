package com.example.pr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice9Application {

	public static void main(String[] args) {
		SpringApplication.run(Practice9Application.class, args);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}

}
