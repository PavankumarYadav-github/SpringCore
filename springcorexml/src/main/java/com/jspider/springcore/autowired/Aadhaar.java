package com.jspider.springcore.autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Aadhaar {
	
	
	private long aadhaarno;
	private String address;
	private String dateofbirth;
	
	
	public long getAadhaarno() {
		return aadhaarno;
	}
	public void setAadhaarno(long aadhaarno) {
		this.aadhaarno = aadhaarno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth)  {
		try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dateofbirth);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		this.dateofbirth = dateofbirth;
		
	}
	@Override
	public String toString() {
		return "Aadhaar [aadhaarno=" + aadhaarno + ", address=" + address + ", dateofbirth=" + dateofbirth + "]";
	}
	
	
	
	

}
