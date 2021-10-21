package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Animal;
import com.te.springcoreannotations.beans.Cat;
import com.te.springcoreannotations.beans.Dog;

@Configuration
public class AnimalConfig {

	@Bean(name = "dog")
	public Animal getDog() {
		Dog dog = new Dog();
		dog.setDId(100);
		return dog;
	}

	@Bean(name = "cat")
	public Animal getCat() {
		Cat cat = new Cat();
		cat.setCId(200);
		return cat;
	}
}
