package com.sai;

public class AssignmentOperators  extends AbstractAssignmentOperators {
	
	public int simpleAssigment(int a) {
		int c =a;
		return c;
	}

	@Override
	public int compoundAssigment(int num1, int num2) {
		num1 += num2;	// num1 = num1 + num2
		return num1;
	}

	@Override
	public int operator(int num1, int num2) {
		num1 -=num2;
		return num1;
	}

	@Override
	public int compoundAssigmentPlus(int num1, int num2) {
		num1 +=num2;
		return num1;
	}

	@Override
	public int compoundAssigmentMinus(int num1, int num2) {
		num1 -=num2;
		return num1;
	}

	@Override
	public int compoundAssigmentMul(int num1, int num2) {
		num1 *=num2; 
		return num1;
	}

	@Override
	public int compoundAssigmentDivding(int num1, int num2) {
		num1 /=num2;
		return num1;
	}

}
