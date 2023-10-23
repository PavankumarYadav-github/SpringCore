package com.jspider.springcore.autowired.withxml;



public class Person {
	
	private String name;
	private long contact;
	private Aadhaar aadhaar;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public Aadhaar getAadhaar() {
		return aadhaar;
	}
	
	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", contact=" + contact + ", aadhaar=" + aadhaar + "]";
	}
	
	

}
