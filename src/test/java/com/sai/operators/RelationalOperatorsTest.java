package com.sai.operators;

import org.junit.Test;

import com.sai.RelationalOperators;
import com.sai.RelationalOperatorsIf;

public class RelationalOperatorsTest {
	
	@Test
	public void doubleEqual(){
		
		int var1 = 5, var2 = 3, var3 = 9;
		
		System.out.println("var1 = "+ var1);
		System.out.println("var2 = "+ var2);
		System.out.println("var3 = "+ var3);
		
		System.out.println("var1 == var2:"+ (var1 ==var2));
		System.out.println("var1 == var3:"+(var1 == var3));

		
		
		RelationalOperatorsIf ao = new RelationalOperators();
		boolean c= ao.doubleEqual(12,23);
		System.out.println("doubleEqual is "+c);
		
		c= ao.doubleEqual(23,23);
		System.out.println("doubleEqual test2 is "+c);
		
		
		System.out.println("var1 == var2:"+ ao.doubleEqual(var1, var2));
		System.out.println("var1 == var3:"+ao.doubleEqual(var1, var3));
	}
	@Test
	public void notEqual() {
		RelationalOperatorsIf ao = new RelationalOperators();
		boolean c= ao.notEqual(2,2);
		System.out.println("notEqual is"+ c);
		
		
	}
	
	@Test
	public void greaterThan() {
		RelationalOperatorsIf ao = new RelationalOperators();
		boolean c = ao.greaterThan(30, 30);
		System.out.println("greaterThan is "+ c);
		
		
	}
	@Test
	public void greaterLessThan() {
		RelationalOperatorsIf ao = new RelationalOperators();
		boolean c = ao.greaterLessThan(10, 43);
		System.out.println("greaterLessThan is"+ c);
		
	}
	
	@Test
	public void greaterThanEqual() {
		RelationalOperatorsIf ao = new RelationalOperators();
		boolean c = ao.greaterThanEqual(12, 34);
		System.out.println("greaterThanEqual"+ c);
		
	}
	@Test
	public void lessThanEqual() {
		RelationalOperatorsIf ao = new RelationalOperators();
		boolean c = ao.lessThanEqual(23, 21);
		System.out.println("lessThanEqual is"+ c);
		
	}
	
	

}
