package com.jspider.springcore.autowired.withxml;

public class Employee {
	
	private int id;
	private String name;
	private long contact;
	
	public Employee(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
	
	
	
	

}
