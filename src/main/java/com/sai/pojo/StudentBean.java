package com.sai.pojo;

public class StudentBean {
	private String name;
	private int id;
	private int age;
	private String address;
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
		
	}
	
	public void setId(int id ) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getage() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
}
