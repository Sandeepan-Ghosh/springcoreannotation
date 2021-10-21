package com.te.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoreannotations.beans.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Employee employee= context.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
