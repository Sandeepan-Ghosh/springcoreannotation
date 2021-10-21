package com.te.springcoreannotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class AddressOne {
	// @Value("444")
	// private int hNo;

	private int hno;
	private String state;

	void getAdd() {
		System.out.println("Address is: Bengaluru");
	}
}
