package com.sai.operators;

import org.junit.Test;

public class TernaryOperatorTest {
	
	@Test
	public void ternaryOperTest() {
		
		int a = 20, b = 12,  max;
		
		System.out.println("first num :"+ a);
		System.out.println("second num:"+ b);
		
		max = (a > b) ? a:b;
		
		System.out.println("maximum :"+ max);
	}
	
	
	@Test
	public void ternaryOperTest1() {
		boolean conditions = false;
		String result = (conditions) ? "True" : "False";
		System.out.println(result);
		
	}
	
	
}


