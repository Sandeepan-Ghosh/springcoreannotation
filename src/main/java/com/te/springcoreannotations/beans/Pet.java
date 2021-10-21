package com.te.springcoreannotations.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Pet implements InitializingBean {
	private String name;
	@Autowired
	@Qualifier("cat")
	private Animal animal;

	@Override
	public void afterPropertiesSet() throws Exception {
		animal.eat();
		animal.walk();
	}

}
