package com.sai.operators;

import org.junit.Test;

public class ArithmeticOperatorsTest {

	ArithmeticOperatorsIf ao= new ArithmeticOperators();// object creation assigned to interface
	
	AbstractArithmeticOperator ao1= new ArithmeticOperators();	// object creation and assigned to Abstract class
	
	ArithmeticOperators ao2= new ArithmeticOperators();			// object creation and assigned to implemented class
	
	@Test
	public void addTest(){
//		ArithmeticOperatorsIf ao= new ArithmeticOperators();// object creation assigned to interface
		int c = ao.add(10, 20);								// only interface only accessed 
		System.out.println("Addition "+c);
		
		double d = ao.add(10.2, 2.2);
		System.out.println("Addition of override method of double data type is "+d);	
	}
	
	@Test
	public void subTest(){
		int c = ao.sub(30, 20);
		System.out.println("Subtraction is "+c);
	}
	
	@Test
	public void mulTest() {
		AbstractArithmeticOperator ao1= new ArithmeticOperators();	// object creation and assigned to Abstract class
		int c = ao1.mul(10, 2);											// only abstract class method can access
		System.out.println("Multiplication  is "+c);
	}
	
	@Test
	public void divTest() {
		ArithmeticOperators ao2= new ArithmeticOperators();			// object creation and assigned to implemented class
		int c = ao2.div(20, 10);										// All implemented class method can access
		System.out.println("division is "+c);
	}
	
	@Test
	public void moduleTest() {
		int c = ao2.modules(21, 2);
		System.out.println("Modules is "+c);
	}
	
}
