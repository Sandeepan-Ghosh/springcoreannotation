package com.te.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.beans.Pet;
import com.te.springcoreannotations.config.AllConfig;

public class PetTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Pet pet = context.getBean("pet", Pet.class);
		System.out.println(pet);
	}

}
