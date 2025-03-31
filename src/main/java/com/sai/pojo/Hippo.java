package com.sai.pojo;

public class Hippo {
	public static void main(String[] args) {
		System.out.println("c");
		new Hippo();
		new Hippo();
		new Hippo();
	}
	static {System.out.println("B");}

}
