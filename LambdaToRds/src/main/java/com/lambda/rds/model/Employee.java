package com.lambda.rds.model;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	
	public int getId() {
		return id;
	}	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.firstName);
		sb.append(", " + this.lastName);
		sb.append(", " + this.address1);
		sb.append(", " + this.address2);
		sb.append(", " + this.city);
		sb.append(", " + this.state);
		sb.append(", " + this.zipcode);
		return sb.toString();
	}
	
	
}
