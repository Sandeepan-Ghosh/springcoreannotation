package com.te.springcoreannotations.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("add1")
public class Address {
	@Value("Patna")
	private String city;
	@Value("Bihar")
	private String state;
}
