package com.sai.operators;

public class ArithmeticOperatorExampless1 {
	public static void main(String[] args) {
		int f = 3;
		System.out.println("f+=3:"+(f+=3));
		System.out.println("f-=4:"+(f+=4));
		System.out.println("f*=3:"+(f*=3));
		System.out.println("f/=5:"+(f/=5));
		System.out.println("f%=6:"+(f%=6));
		System.out.println("f&=0b1010"+(f&=0b1010));
		System.out.println("f|=0b1010"+(f|=0b1010));
		System.out.println("f^=0b1010"+(f^=0b1010));
		System.out.println("f<<=2"+(f<<=2));
		System.out.println("f>>=2:"+(f<<=2));
		System.out.println("f>>>=2:"+(f>>>=2));
		
		addition(10,29);
		substarction(12,43);
		division(12,4);
		module(12,3);
		
	}
	public static void addition(int a, int b) {
		int sum = a+b;
		System.out.println("The sum is"+sum);
	}
	public static void substarction(int a, int b) {
		int sub = a-b;
		System.out.println("The sub is "+ sub);
	}
	public static void multication(int a, int b) {
		int multi = a*b;
		System.out.println("The multi is "+ multi);
		
	}
	public static void division(int a, int b) {
		int divi = a/b;
		System.out.println("The divi is "+divi);
	}
	public static void module(int a, int b) {
		int mod = a%b;
		System.out.println("The mod is "+mod);
	}

}
