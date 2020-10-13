package com.example.demo;

import org.apache.derby.jdbc.ClientDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.example.demo.services.InvoiceDaoImpl;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringJdbcApplication.class, args);
		InvoiceDAO dao=ctx.getBean(InvoiceDaoImpl.class);
		
		//Invoice inv=ctx.getBean("getInvoice",Invoice.class);
		
		//dao.add(inv);
		
		Invoice found=dao.findById(101);
		
		System.out.println(found.toString());
	
	}
	
	public ClientDriver driver()
	{
		return new ClientDriver();
	}
	
	
	
	@Bean
	public SimpleDriverDataSource dataSource()
	{
		SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
		
		dataSource.setDriver(driver());
		dataSource.setUrl("jdbc:derby://localhost:1527/SampleDb;create=true");
		
		return dataSource;
	
	}
	
	@Bean
	public JdbcTemplate template()
	{
		return new JdbcTemplate(dataSource());
	}
	
	

}
