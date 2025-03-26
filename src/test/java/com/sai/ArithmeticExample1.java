package com.sai.operators;

public class ArithmeticExample1 {
	public static void main(String[] args) {
		int a = 23;
		int b = 45;
		int sum = a + b+num();
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
		addition(a, b);
		sub(a, b);
	}

	public static void addition(int a, int b) {
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	public static void sub(int a, int b) {
		int sum = a - b;
		System.out.println("The sub of " + a + " and " + b + " is " + sum);
	}
	
	public static int num() {
		return 200;
	}
	
}
