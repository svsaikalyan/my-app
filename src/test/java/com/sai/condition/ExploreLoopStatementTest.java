package com.sai.condition;

import org.junit.Test;

public class ExploreLoopStatementTest {
	
	@Test
	public void loopSta() {
		int arr[] = {1,2,3,4,5,6,7};
		
		for (int e: arr) {
			System.out.print(e+" ");
		}
		
			
		
	}
	@Test
	public void doWhile() {
		int i = 1;
		do {
			System.out.println("hello:"+i);
			i++;
		}while(i<=6);
	}
	
	@Test
	public void whileLoop1() {
		int i = 1;
		while(i <6) {
			System.out.println("HelloWorld");
			i++;
		}
	}
	
	
	

}
