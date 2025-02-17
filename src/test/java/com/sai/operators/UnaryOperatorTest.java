package com.sai.operators;

import org.junit.Test;

import com.sai.UnaryOperator;
import com.sai.UnaryOperatorsIf;

public class UnaryOperatorTest {

	@Test
	public void uniaryMinusTest() {
		UnaryOperatorsIf uo = new UnaryOperator();
		int c = uo.uniairyMinus(30);
		System.out.println("uniairyMinus is " + c);

	}

	@Test
	public void notOperatorTest() {
		UnaryOperatorsIf uo = new UnaryOperator();
		Boolean d = uo.notOperator(true);
		System.out.println("boolean is " + d);

		int a = 10, b = 1;

		System.out.println("!(a < b) = " + !(a < b)); // !(10<1) -> !(false) -> true
		System.out.println("!(a > b) = " + !(a > b)); // !(10>1) -> !(true) -> false

		System.out.println("!(a < b) = " + uo.notOperator(a < b)); // uo.notOperator( 10< 1) -> uo.notOperator( false)
																	// -> true.
		System.out.println("!(a > b) = " + uo.notOperator(a > b)); // uo.notOperator(10> 1) -> true

	}

	@Test
	public void postIncrement() {
		UnaryOperatorsIf uo = new UnaryOperator();
		int s = uo.postIncrement(7);
		System.out.println("postincrement is " + s);
	}

	@Test
	public void preIncrement() {
		UnaryOperatorsIf uo = new UnaryOperator();
		int f = uo.preIncrement(5);
		System.out.println("preIncrement is " + f);

	}

}
