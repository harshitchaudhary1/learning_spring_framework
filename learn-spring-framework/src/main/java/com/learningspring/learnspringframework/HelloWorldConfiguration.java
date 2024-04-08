package com.learningspring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name , int age, Address Address ) {};
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
		return new Person("Ravi",20 , new Address("Main Street","Ghaziabad"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(),address());
	}
	@Bean
	public Person person3Parameters(String name , int age , Address address3) {
		return new Person(name,age,address3);
	}
	
	@Bean
	public Person person4Parameters(String name , int age , Address address3) {
		return new Person(name,age,address3);
	}
	
	@Bean(name = "Address2")
	public Address address() { 
		return new Address("Adarsh Nagar","Modinagar");
	}
	@Bean(name = "address3")
	public Address address3() {
		return new Address("Nek","Meerut");
	}
}
