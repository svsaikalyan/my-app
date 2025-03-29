package com.sai.pojo;

public class Beetle extends Insert {
	protected int numberOfLegs = 6;
	short age = 3;
	public void printData() {
		this.label="hello";
		System.out.println(this.label);
		System.out.println(super.label);
		System.out.println(this.age);
//		System.out.println(super.age);
		System.out.println(numberOfLegs);
	}
	public static void main(String[] args) {
			   new Beetle().printData();

	}

}
