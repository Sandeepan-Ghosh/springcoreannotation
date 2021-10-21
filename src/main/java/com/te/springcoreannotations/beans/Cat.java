package com.te.springcoreannotations.beans;

import lombok.Data;

@Data
public class Cat implements Animal {
	private int cId;

	@Override
	public void eat() {
		System.out.println("Cat eats....");
	}

	@Override
	public void walk() {
		System.out.println("Cat walks....");
	}

}
