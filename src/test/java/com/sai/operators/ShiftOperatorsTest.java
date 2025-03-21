package com.sai.operators;

import org.junit.Test;

public class ShiftOperatorsTest {
	
	@Test
	
	public void shiftOperators() {
		int number = 3;
		
		int c = number <<2;
		System.out.println(c);
	}
	
	@Test
	public void shiftOperators1() {
		int number = 8;
		
		int c = number >>2;
		System.out.println(c);
		
	}
	@Test
	public void shiftOpertors2() {
		byte b =14;
		byte c =16;
		
		System.out.println(b >>> 2);
		System.out.println(c >>> 3);
	}
	
	@Test
	public void ShiftOperators() {
		byte a = 13;
		byte b = 14;
		
		System.out.println(a << 3);
		System.out.println(b << 2);
	}

}
