package com.sai.pojo;

public class Crocodile extends Reptile {
	protected int speed  = 30;
	protected int getspeed() {
		return speed;
	}
	public static void main(String[] args) {
		Crocodile ar = new Crocodile();
		System.out.println(ar.getspeed());
	}

}
