package com.sai.operators;
/**
 * What is Arithmetic Operator
 * + - * / % 
 * These operators involve the mathematical operators that can be used to perform various simple or advanced arithmetic operations on the primitive data types referred to as the operands. 
 * These operators consist of various unary and binary operators that can be applied on a single or two operands. 
 * Let’s look at the various operators that Java has to provide under the arithmetic operators. 
 * 
 */
public interface ArithmeticOperatorsIf {
	/**
	 * + (addition)  This operator is a binary operator and is used to add two operands.
	 * num1 +num2 or a+b
	 * @param a
	 * @param b
	 * @return
	 */
	int add(int a, int b);
	
	/**
	 * - (subtraction) 
	 * @param a
	 * @param b
	 * @return
	 */
	int sub(int a, int b);
	
	double add(double a, double b);
}
