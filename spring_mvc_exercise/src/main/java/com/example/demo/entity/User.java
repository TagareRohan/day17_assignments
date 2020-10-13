package com.example.demo.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@NotNull(message="cannot be empty")
	String userName;
	
	@NotNull(message="cannot be empty")
	String password;
	
	@NotNull(message="cannot be empty")
	@Range(min=2,max=100,message="not in range")
	int age;
	
	@NotNull(message="cannot be empty")
	@Size(min=3,max=10,message="not in range")
	String firstName;
	
	@NotNull(message="cannot be empty")
	@Size(min=3,max=10,message="not in range")
	String lastName;
}
