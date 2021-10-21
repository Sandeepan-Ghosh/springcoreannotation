package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Pet;

@Configuration
public class PetConfig {

	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet= new Pet();
		pet.setName("First_Pet");
		return pet;
	}
}
