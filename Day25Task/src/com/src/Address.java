package com.src;


public class Address {
	private int hno;
	private String city;
	
	
	
	
	
	public Address(int i, String string) {
		
	}



	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}



	public int getHno() {
		return hno;
	}



	public void setHno(int hno) {
		this.hno = hno;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}
}
