package com.sai.operators;

public class RelationalOperatorExamples {
	public static void main(String[] args) {
		int a =2;
		int b =5;
		int c = 7;
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a==b:"+(a==c));
		System.out.println("a!=c:"+(a!=c));
		
		lessthan(2,4);
		greaterthan(3,5);
		greaterthanequal(54,12);
		lessthanequal(23,13);
		equalto(12,12);
		notequal(11,11);
		
	}
	public static void lessthan(int l, int r) {
		boolean res = l < r;
		System.out.println("The less than comparation is "+res);
		
		
	}
	public static void greaterthan(int d, int s) {
		boolean re = d> s;
		System.out.println("The greater than comparation is "+re);
	}
	public static void  greaterthanequal(int f, int g) {
		boolean reb = f >= g;
		System.out.println("The greaterthan equal  " + reb);
		
	}
	public static void lessthanequal(int q, int a) {
		boolean nub = q<=a;
		System.out.println("The lessthanequal is"+nub);
		
	}
	public static void equalto(int a, int q) {
		boolean feb = a==q;
		System.out.println("The equal is"+feb);
		
	}
	public static void notequal(int h, int l) {
		boolean res = h!=l;
		System.out.println("The notequal is "+res);
		
	}

}
