package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.AddressOne;
import com.te.springcoreannotations.beans.Person;

@Configuration
//@ComponentScan(basePackages = "com.te.springcoreannotations")
public class PersonConfig {
	@Bean(name = "address")
	public AddressOne getAddress() {
		AddressOne addressOne = new AddressOne();
		addressOne.setHno(400);
		addressOne.setState("Karnataka");
		return addressOne;
	}

	@Bean(name = "person")
	public Person getPerson() {
		Person person = new Person();
		person.setId(100);
		person.setName("Abhishek");
		return person;
	}
}
