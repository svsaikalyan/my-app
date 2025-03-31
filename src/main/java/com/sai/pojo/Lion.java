package com.sai.pojo;

public class Lion extends Animal {
	
	protected void setProperties(int age , String n ) {
		setAge(age);
		name = n;
	}
	public void roar() {
		System.out.println(name+", age "+ getAge()+", says: Roar!");
	}
	public static void main(String[] args) {
		Lion ar = new Lion();
		ar.setProperties(5, "tiger");
		ar.roar();
	}
}
