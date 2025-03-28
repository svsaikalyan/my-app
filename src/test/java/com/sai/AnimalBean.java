package com.sai.pojo;

public class AnimalBean {
	private String name;
	private int id;
	private int age;
	private String address;
	private int height;
	
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
	public void setHeight(int height) {
		this.height = height;
	}
	public int getheight() {
		return height;
	}
	
}
