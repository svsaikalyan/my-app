package com.sai.operators;

import org.junit.Test;

import com.sai.AssignmentOperators;
import com.sai.AssignmentOperatorsIf;

public class AssignmentOperatorsTest {
	
	@Test
	public void simpleCompound() {
		int a= 10, b=20;
		int c1 = a+b;
		AssignmentOperatorsIf ao = new AssignmentOperators();
		int c = ao.simpleAssigment(12);
		System.out.println("simpleCompound is"+ c);
		
	}
	
	@Test
	public void compoundAssigment() {
		AssignmentOperatorsIf uo = new AssignmentOperators();
		int d = uo.compoundAssigment(56, 10);
		System.out.println("compoundAssigment is "+ d);
		
	}
	@Test
	public void operator() {
		AssignmentOperatorsIf po = new AssignmentOperators();
		int s = po.operator(23, 3);
		System.out.println("operator is"+s);
		
	}
	
	@Test
	public void compoundAssigmentPlus() {
		AssignmentOperatorsIf po = new AssignmentOperators();
		int s = po.compoundAssigmentPlus(123, 3);
		System.out.println("compoundAssignmentplus is"+s);
		
	}
	
	@Test
	public void compoundAssigmentMinus() {
		AssignmentOperatorsIf po = new AssignmentOperators();
		int s = po.compoundAssigmentMinus(999, 99);
		System.out.println("compoundAssigmentMinus is"+s);
		
	}
	
	@Test
	public void compoundAssigmentMul() {
		AssignmentOperatorsIf po = new AssignmentOperators();
		int s = po.compoundAssigmentMul(999, 99);
		System.out.println("compoundAssigmentMul is"+s);
		
	}
	
	@Test
	public void compoundAssigmentDivding() {
		AssignmentOperatorsIf po = new AssignmentOperators();
		int s = po.compoundAssigmentDivding(999, 99);
		System.out.println("compoundAssigmentDivding is"+s);
		
	}
	
	
	
	
	


}

