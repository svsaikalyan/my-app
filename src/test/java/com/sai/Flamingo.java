package com.sai.pojo;

public class Flamingo {
	private String color = null;
	public void setcolor(String color){
		this.color = color;	
	}
	public static void main(String[] args) {
		Flamingo ar =new Flamingo();
		ar.setcolor("white");
		System.out.println(ar.color);
		
	}

}
