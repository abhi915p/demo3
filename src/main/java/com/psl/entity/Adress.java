package com.psl.entity;

public class Adress {
	private String city;
	private String street;
	private String zip;
	public String getCity() {
		return city;
	}
	public Adress(){
		System.out.println("In default constructor of Adress");
		
	}

	
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Adress(String city, String street, String zip) {
		//super();
		this.city = city;
		this.street = street;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Adress [city=" + city + ", street=" + street + ", zip=" + zip
				+ "]";
	}
	
}
