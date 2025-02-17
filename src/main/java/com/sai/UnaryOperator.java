package com.sai;

public class UnaryOperator extends AbtractUnaryOperator {

	@Override
	public int uniairyMinus(int i) {
		return -i;
	}

	@Override
	public boolean notOperator(Boolean b) {
		return !b;
	}

	@Override
	public int postIncrement(int a) {
		return a++;
	}

	@Override
	public int preIncrement(int b) {
		return ++ b;
	}
	

}
