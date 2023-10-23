package com.jspider.springcore.autowired.withxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpCompMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/jspider/springcore/autowired/withxml/CompEmpConfig.xml");
		Company company =context.getBean("comp1",Company.class);
		System.out.println(company);
	}

}
