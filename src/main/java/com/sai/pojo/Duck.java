package com.sai.pojo;

public class Duck {
	private String color;
	private int height;
	private int length;
	
	public void setData(int legth, int theheight) {
		length = this.length;
		height = theheight;
		this.color = "white";
	}
	public static void main(String[] args) {
		Duck ar=new Duck();
		ar.setData(2, 4);
		System.out.println("ar.length"+" "+"ar.height"+" "+ar.color);
	}

}
