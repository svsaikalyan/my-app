package com.sai.operators;

public abstract class AbstractArithmeticOperator implements ArithmeticOperatorsIf {
	
	@Override
	public int add(int a, int b) {
		System.out.println("Abstract addtion");
		return a+b;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public abstract int mul(int a, int b);

	/**
	 * Modulus(%): This is a binary operator that is used to return the remainder
	 * when the first operand(dividend) is divided by the second operand(divisor).
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int modules(int a, int b) {
		return a % b;
	}
}
