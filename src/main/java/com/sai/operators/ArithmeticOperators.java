package com.sai.operators;

public class ArithmeticOperators extends AbstractArithmeticOperator{

	@Override
	public int add(int a, int b) {
		System.out.println("implemented class addtion");
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	
	/**
	 * Division(/): This is a binary operator that is used to divide the first operand(dividend) by the second operand(divisor) and give the quotient as a result. 
	 * @param a
	 * @param b
	 * @return
	 */
	public int div(int a, int b){
		return a/b;
	}

	@Override
	public double add(double a, double b) {
		return a+b;
	}
	
	
}
