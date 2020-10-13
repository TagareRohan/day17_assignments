package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.User;

@SpringBootApplication
public class SpringMvcExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExerciseApplication.class, args);
	}
	
	@Bean
	public User user()
	{
		return new User();
	}

}
