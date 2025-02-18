package com.sai;

public class LogicalOperators extends AbstractLogicalOperators{

	@Override
	public boolean logicalAndOperator(boolean b1, boolean b2) {
		
		return b1 && b2 ;
	}

	@Override
	public boolean logicalOrOperator(boolean b1, boolean b2) {
		
		return b1 || b2;
	}

}
