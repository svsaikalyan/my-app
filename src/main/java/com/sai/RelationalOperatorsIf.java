package com.sai;

public interface RelationalOperatorsIf {
	
	
	/**
	 * This operator is used to check whether the two given operands are equal or not. 
	 * The operator returns true if the operand at the left-hand side is equal to the right-hand side, else false. 
	 * Syntax: var1 == var2
	 * @param op2
	 * @return
	 */
	boolean doubleEqual(int op1, int op2);
	/**
	 * This operator is used to check whether the two given operands are equal or not. It functions opposite to that of the equal-to-operator. 
	 * It returns true if the operand at the left-hand side is not equal to the right-hand side, else false.
	 * Syntax :var1 != var2
	 * @param op2
	 * @return
	 */
	boolean notEqual(int op1, int op2);
	/**
	 * This checks whether the first operand is greater than the second operand or not. 
	 * The operator returns true when the operand at the left-hand side is greater than the right-hand side.
	 * @Syntax : var1 > var2
	 * @param op2
	 * @return
	 */
	boolean greaterThan(int op1, int op2);
	/**
	 * This checks whether the first operand is less than the second operand or not. The operator returns true when the operand at the left-hand side is less than the right-hand side. 
	 * It functions opposite to that of the greater-than operator. 
	 * Syntax: var1 < var2
	 * @param op2
	 * @return
	 */
	boolean greaterLessThan(int op1, int op2);
	/**
	 * This checks whether the first operand is greater than or equal to the second operand or not. 
	 * The operator returns true when the operand at the left-hand side is greater than or equal to the right-hand side.
	 * syntax : var1 >= var2
	 * @param op2
	 * @return
	 */
	boolean greaterThanEqual(int op1, int op2);
	/**
	 * This checks whether the first operand is less than or equal to the second operand or not. 
	 * The operator returns true when the operand at the left-hand side is less than or equal to the right-hand side. 
	 * syntax: var1 <= var2
	 * @param op2
	 * @return
	 */
	boolean lessThanEqual(int op1,int op2);
	
	

}
