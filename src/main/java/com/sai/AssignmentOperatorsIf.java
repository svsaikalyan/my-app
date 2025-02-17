package com.sai;

/**
 * 
 */
public interface AssignmentOperatorsIf {
	/**
	 * The Simple Assignment Operator is used with the “=” sign where the left side consists of 
	 * the operand and the right side consists of a value. The value of the right side must be of the same data type that has been defined on the left side
	 * @param a
	 * @return
	 */
	int simpleAssigment(int a);
	/**
	 * The Compound Operator is used where +,-,*, and / is used along with the = operator.
	 * @param num1
	 * @param num2
	 * @return
	 */
	int compoundAssigment(int num1, int num2);
	/**
	 * This is the most straightforward assignment operator, which is used to assign the value on the right to the variable on the left. 
	 * This is the basic definition of an assignment operator and how it functions.
	 * @param num1
	 * @param num2
	 * @return
	 */
	int operator(int num1,int num2);
	/**
	 * This operator is a compound of ‘+’ and ‘=’ operators. It operates by adding the current value of the 
	 * variable on the left to the value on the right and then assigning the result to the operand on the left. 


	 * @param num1
	 * @param num2
	 * @return
	 */
	int compoundAssigmentPlus(int num1, int num2);
    /**
     * This operator is a compound of ‘-‘ and ‘=’ operators. It operates by subtracting the variable’s value on the right from the current value of the 
     * variable on the left and then assigning the result to the operand on the left. 


     * @param num1
     * @param num2
     * @return
     */
	int compoundAssigmentMinus(int num1, int num2);
	/**
	 * This operator is a compound of ‘-‘ and ‘=’ operators. It operates by subtracting the variable’s 
	 * value on the right from the current value of the variable on the left and then assigning the result to the operand on the left. 


	 * @param num1
	 * @param num2
	 * @return
	 */
	int compoundAssigmentMul(int num1, int num2);
	/**
	 * This operator is a compound of ‘/’ and ‘=’ operators. It operates by dividing the current value of the variable on the left by the value on the right and then assigning 
	 * the quotient to the operand on the left
	 * @param num1
	 * @param num2
	 * @return
	 */
	int compoundAssigmentDivding(int num1, int num2);
}
