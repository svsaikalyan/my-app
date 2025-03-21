package com.sai;

public interface LogicalOperatorsIf {
	

	/**
	 * logicalAndOperator (&&), 
	 * 1. It is usually used in Boolean expressions.
	 * This operator returns true when both the conditions under consideration are satisfied or are true. If even one of the two yields false, 
	 * the operator results false. In Simple terms, cond1 && cond2 returns true
	 * && -logical AND
	 * @param b2
	 * @return
	 */
	public boolean logicalAndOperator(boolean b1, boolean b2);
	
	
	/**
	 * This operator returns true when one of the two conditions under consideration is satisfied or is true. 
	 * If even one of the two yields true,
	 * The operator results true. To make the result false, both the constraints need to return false.
	 * @param b1
	 * @param b2
	 * @return
	 */
	
	public boolean logicalOrOperator(boolean b1, boolean b2);
	
	

	
	
}
