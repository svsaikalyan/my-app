package com.sai;

public interface UnaryOperatorsIf {

	int uniairyMinus(int i);

	/**
	 * This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.
	 * 
	 * !(operand) --> 
	 * e.g 
	 * 1. !true -> false
	 * 2. !false -> true
	 * 
	 * @param b
	 * @return
	 */
	boolean notOperator(Boolean b);

	/**
	 * It is used to increment the value of an integer. It can be used in two separate ways.
	 * postIncrement 
	 * num ++
	 */
	int postIncrement(int a);
	
	/**
     * It is used to decrement the value of an integer. It can be used in two separate ways.
     * preIncrement.
     * num--
     */
	int preIncrement(int b);
    
}
