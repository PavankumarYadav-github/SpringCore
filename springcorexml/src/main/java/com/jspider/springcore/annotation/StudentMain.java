package com.jspider.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student=context.getBean("getStudent",Student.class);
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
	}

}
