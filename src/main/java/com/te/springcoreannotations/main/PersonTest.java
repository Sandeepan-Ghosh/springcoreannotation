package com.te.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.beans.Person;
import com.te.springcoreannotations.config.PersonConfig;

public class PersonTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = context.getBean("person", Person.class);
		person.getPer();
		System.out.println("--------------");
		System.out.println(person);
	}
}
