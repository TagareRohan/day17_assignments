package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.entity.Invoice;

@Configuration
public class AppConfig {

	@Bean
	public Invoice getInvoice()
	{
		return new Invoice(101,"ram",400.0);
	}
	
}
