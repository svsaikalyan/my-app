package com.sai.pojo;

public class Hamster {
	private String color;
	private int weight;
	public Hamster(int weight , String color) {
		this.weight = weight;
		this.color = color;
		
	}
	public Hamster(int weight) {
		this.weight = weight;
		color = "white";
		
	}
}







/*public static void main(String[] args) {
	 Hamster ar = new Hamster(5,"grey");
	 System.out.println(ar.get());
}
*/
