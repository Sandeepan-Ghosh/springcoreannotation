package com.te.springcoreannotations.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class Person {
	//@Value("100")
	private int id;
	//@Value("Abhishek")
	private String name;
	@Autowired
	private AddressOne addressOne;

	public void getPer() {
		addressOne.getAdd();
		System.out.println("Person method works....");
	}
}
