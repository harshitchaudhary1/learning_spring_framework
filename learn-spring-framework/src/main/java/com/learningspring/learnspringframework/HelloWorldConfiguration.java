package com.learningspring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name , int age) {};
//Address - firstLine & city
record Address(String firstLine , String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}
	@Bean
	public int age() {
		return 15;
	}
	@Bean
	public Person person() {
		return new Person("Ravi",20);
	}
	@Bean
	public Address address() {
		return new Address("Adarsh Nagar","Modinagar");
	}
}
