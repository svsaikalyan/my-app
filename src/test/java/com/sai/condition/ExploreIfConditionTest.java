package com.sai.condition;

import org.junit.Test;

public class ExploreIfConditionTest {

	@Test
	public void exploreIfContest (){
		int i = 10;
		
		if(i < 15) {
			System.out.println("10 less than 15");
		}
		System.out.println("outside block");
			
		
		
	}
	@Test
	public void explore() {
		
		int i = 12;
		
		if(i == 12) {
			i++;
			System.out.println("i = "+ i);
		}
	}
	
	@Test
	public void explore1() {
		int i = 13;
		
		if(i > 5) {
			System.out.println("The greater than 5");
		}
		else {
			System.out.println("Less than 5");
		}
	}
	
	
	@Test
	
	public void nestedIf() {
		
		int a = 20;
		int b = 10;
		
		if(a == 20) {
			
			if(b ==10 ) {
				System.out.println("nestedIf");
			}
		}
		
		
	}
	
	@Test
	public void ifElseIf() {
		int i = 20;
		
		
		if(i == 10)
			System.out.println("i is 10");
		else if(i == 15)
			System.out.println("i is 15");
		else if(i == 20)
			System.out.println("i is 20");
		else
			System.out.println("i not present");
		
	}
	
	
	@Test
	public void switchCase() {
		int num = 30;
		switch(num) {
		case 5:
			System.out.println("it is 5");
			break;
		case 10:
			System.out.println("it is 10");
			break;
		case 15:
			System.out.println("it is 15");
			break;
		case 20:
			System.out.println("it is 20");
		default :
			System.out.println("not present");
		}
	}
	
	
	@Test
	public void jumpSta() {
		

		for(int i= 0;i<20;i++) {
			if(i % 2==0) 
				continue;
				System.out.println(i+" ");
				
				
			
		}
	}

	
	@Test
	public void loopSta() {
		int arr[] = {1,2,3,4,5,6,7};
		
		for (int e: arr) {
			System.out.print(e+" ");
		}
		
			
		
	}
	
	@Test
	public void whileLoop() {
		int c = 1;
		
		while(c < 5) {
			System.out.println(c);
			c++;
		}
	}
	
	@Test
	public void whileLoop1() {
		int i = 1;
		while(i <6) {
			System.out.println("HelloWorld");
			i++;
		}
	}
	
	@Test
	public void doWhile() {
		int i = 1;
		do {
			System.out.println("hello:"+i);
			i++;
		}while(i<=6);
	}
	
	
	@Test
	public void breakStst() {
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("hello");
			break;
		case 2:
			System.out.println("world");
			break;
		case 3:
			System.out.println("greek");
			break;
		}
	}
	
	@Test
	public void breakExample() {
		
		for(int i=0;i<10;i++) {
			if(i==5) 
				break;
			System.out.println("i:"+ i);
				
			
				
		}
		
		
	}
	@Test
	public void breakImp() {
		for(int i = 0;i<10;i++) {
			if(i == 3)
				continue;
			if(i == 7)
				break;
			System.out.println(i+" ");
		}
		
		
	}
	
	@Test
	public void breakEx1() {
		for(int i=0;i<=4;i++) {
			
			for(int j=0;j<=3;j++) {
				
				if(i==2 && j==3) {
					continue;
				}
				System.out.println(i+"."+j+".");
			}
			System.out.println();
			
		}
		
	}
	
	

}
