package com.jspider.springcore.autowired.withxml;

import java.util.List;


public class Company {
	
	private String name;
	private String location;
	private List<Employee> employees;
	
	public Company(String name, String location, List<Employee> employees) {
		super();
		this.name = name;
		this.location = location;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", employees=" + employees + "]";
	}
	
	
	
	
	
}
