package com.jspider.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonAadharMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/jspider/springcore/autowired/PersonAadharConfig.xml");
		Person person=context.getBean("person1",Person.class);
		System.out.println(person);
	}

}
