package com.sai.operators;

public class ArithmeticExample1 {
//	public static void main(String[] args) {
//		//short	- we are accessing the static methods by Class name
//		short s1= 10;
//		short s2 =20 ;
//		ArithmeticExample1.addition(s1, s2);
//		
//		
//		//Interger - we are calling direactly since with in a class
//		addition(10, 20);
//		subst(50, 40);
//		multication(19, 2, 3);
//		division(12, 4);
//		module(10, 3);
//		
//		// double - we are accessing non static method by object name
//		ArithmeticExample1 ar =new ArithmeticExample1();
//		ar.addition(12.5, 44.5);
//		substraction(12.4, 34.6);
//		multication(12.5, 4.7);
//		division(14.5, 34.5);
//		module(18.5, 14.5);
//		
//	}

	public static void addition(byte a, byte b) {
		byte sum = (byte)(a + b);
		System.out.println("Sum Short "+sum);
	}
	
	public static void addition(short a, short b) {
		short sum = (short)(a + b);
		System.out.println("Sum Short "+sum);
	}
	
	public static void addition(int a, int b) {
		int sum = a+b;
		System.out.println("The sum of "+a+"and "+b+ "is "+sum);	
	}

	public static void addition(long a, long b) {
		long sum = a+b;
		System.out.println("The sum of "+a+"and "+b+ "is "+sum);	
	}
	
	private static void addition(double d, double e) {
		double sum=  d+e;
		System.out.println("The sum of "+d+" and "+e+" is "+sum);
	}
	public void addition(float a, float b) {
		float sum = a + b;
		System.out.println("Sum Short "+sum);
	}
	
	private static void substraction(double d, double e) {
		double sub = d-e;
		System.out.println("The sum of "+d+"and "+e+ "is "+sub);
	}
	
	private static void multication(double d, double e) {
		double multi = d*e;
		System.out.println("The sum of "+d+"and "+e+ "is "+multi);
	}
	
	private static void division(double d, double e) {
		double divi = d/e;
		System.out.println("The sum of "+d+"and "+e+ "is "+divi);
	}
	
	private static void module(double d, double e) {
		double mod = d%e;
		System.out.println("The sum of "+d+"and "+e+ "is "+mod);
		
	}
	
	public static void subst(int a, int b) {
		int sub = a-b;
		System.out.println("The sum of "+a+"and "+b+ "is "+sub);	
	}
	public static void multication(int a, int b, int c) {
		int multi = a*b*c;
		System.out.println("The sum of "+a+"and "+b+ "is "+multi);
	}
	
	public static void division(int a, int b) { 
		int divi = a/b;
		System.out.println("The sum of "+a+"and "+b+ "is "+divi);
	}
	
	public static void module(int a, int b) {
		int mod = a%b;
		System.out.println("The sum of "+a+"and "+b+ "is "+mod);	
	}
}