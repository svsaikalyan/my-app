package com.sai.operators;

import org.junit.Test;

import com.sai.LogicalOperators;
import com.sai.LogicalOperatorsIf;

public class LogicalOperatorsTest {
	
	
	@Test
	public void logicalAndOperTest() {
		System.out.println("#### && ####");
		System.out.println("true && true :" + (true && true ));	// 1st condition check is true, continue to validate next condition is true - so finally true
		System.out.println("true && false :" + (true && false));	// 1st condition check is true, continue to validate next condition is false - false
		System.out.println("false && true :" + (false && true));	//> 1st check is false - I wont continue for next condition check - so finally its false
		System.out.println("false && false :" + (false && false));	//> 1st check is false - I wont continue for next condition check - so finally its false
		
		
		System.out.println("true & true :" + (true & true ));
		System.out.println("true & false :" + (true & false));
		System.out.println("false & true :" + (false & true));
		System.out.println("false & false :" + (false & false));
		
		System.out.println("#### ope1 &&  ope2 && ope3 ####");
		
		System.out.println("true && true && true :" + (true && true && true));	//-> (true && true) && true -> true && true -> true
		System.out.println("true && false && true :" + (true && false && true));	// ->
		System.out.println("false && true && false :" + (false && true && false));
		System.out.println("false && false && true :" + (false && false && true));
		System.out.println();
		
		System.out.println("true & true & true:" + (true & true & true));
		System.out.println("true & false & true :" + (true & false & true ));
		System.out.println("false & true & false:" + (false & true & false));
		System.out.println("false & false & true :" + (false & false & true));
		
		int a = 23, b = 24, c = 24, d = 0;
		System.out.println("var1 = "+ a);
		System.out.println("var2 ="+ b);
		System.out.println("var3 = "+ c);
		
		if((a>b)&& (b>c)) {
			d = a+b+c;
		}
		System.out.println("the sum :" + d);
		
		
		LogicalOperators ao= new LogicalOperators();
		ao.logicalAndOperator(true, false);
		ao.logicalAndOperator(true, true);
		ao.logicalAndOperator(false, true);
		if(ao.logicalAndOperator(a>b, b>c)) {
			d = a+b+c;
		}
		
		System.out.println("the sum at 2nd time :" + d);
	}
	
	@Test
	public void logicalOrOperTest() {
		
		System.out.println(" ### || ###");
		
		System.out.println("true || true :" + (true || true ));	// 1st condition is true, no need to continue to next condition, so finally its true
		System.out.println("true || false :" + (true || false)); // 1st condition is true, no need to continue to next condition, so finally its true
		System.out.println("false || true :" + (false || true));// // 1st condition is false, check the next condition is true, so finally its true
		System.out.println("false || false :" + (false || false)); // 1st condition is false, check the next condition is false, so finally its false
		
		System.out.println("true | true :" + (true | true ));
		System.out.println("true | false :" + (true | false));
		System.out.println("false | true :" + (false | true));
		System.out.println("false | false :" + (false | false));
		
		
		int a = 12, b = 21, c = 6,d = 12;
		System.out.println("var1 = "+ a);
		System.out.println("var2 = "+ b);
		System.out.println("var3 = "+ c);
		System.out.println("var4 = "+ d);
		if(a>b || c>d) {
			System.out.println("one or two + conditions true");
		}
		else {
			System.out.println("both conditions are false");
		}
			
		
		LogicalOperatorsIf lo = new LogicalOperators();
		lo.logicalOrOperator(true, true);
		lo.logicalOrOperator(true, false);
		lo.logicalOrOperator(false, true);
		lo.logicalOrOperator(false, false);
		
		
		
		
		
		
	}
	
	
	
	

}
