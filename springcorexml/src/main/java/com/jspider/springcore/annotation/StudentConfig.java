package com.jspider.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jspider.springcore.annotation")
public class StudentConfig {
	
	@Bean
	public Student getStudent() {
		Student student=new Student();
		student.setName("Alex");
		return student;
	}
	

}
