package com.te.springcoreannotations.beans;

import lombok.Data;

@Data
public class Dog implements Animal {
	private int dId;

	@Override
	public void eat() {
		System.out.println("Dog eats....");
	}

	@Override
	public void walk() {
		System.out.println("Dog walks....");
	}

}
