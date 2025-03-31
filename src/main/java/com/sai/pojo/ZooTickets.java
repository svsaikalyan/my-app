package com.sai.pojo;

public class ZooTickets {
	private String name = "BestZoo";
	{System.out.println(name + "-");}
	private static int count = 0;
	static {System.out.println(count + "-");}
	static {count +=10; System.out.println(count + "-");}
	
	public ZooTickets() {
		System.out.println("z-");
	}
	
	public static void main(String[] args) {
		new ZooTickets();
	}

}
