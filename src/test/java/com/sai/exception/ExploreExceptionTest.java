package com.sai.exception;

import org.junit.Test;

public class ExploreExceptionTest {

	@Test
	public void take1(){
		int c=0;
		System.out.println("Take1 Started");
		try {
			c= 10/0;
		} catch (Exception e) {
			System.out.println("Exception occired "+e);
			e.printStackTrace();
		}
		System.out.println(c+"completed");
	}
	
	@Test
	public void take2(){
		int c=0;
		System.out.println("Take2 Started");
		try {
			c= 10/0;
		} catch (Throwable e) {
			System.out.println("Exception occired "+e);
			e.printStackTrace();
		}
		finally {
			System.out.println("This is final ");
		}
		System.out.println(c+"completed");
	}
}
