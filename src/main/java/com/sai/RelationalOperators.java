package com.sai;

public class RelationalOperators extends AbstractRelationalOperators{

	@Override
	public boolean doubleEqual(int op1, int op2) {
		boolean result = op1==op2;
		return result;
	}

	@Override
	public boolean notEqual(int op1, int op2) {
		boolean result = op1!=op2;
		return result;
	}

	@Override
	public boolean greaterThan(int op1, int op2) {
		boolean result = op1>op2;
		return result;
	}

	@Override
	public boolean greaterLessThan(int op1, int op2) {
		boolean result = op1>=op2;
		return result;
	}

	@Override
	public boolean greaterThanEqual(int op1, int op2) {
		boolean result = op1>=op2;
		return false;
	}

	@Override
	public boolean lessThanEqual(int op1, int op2) {
		boolean result = op1<=op2;
		return result;
	}

}
