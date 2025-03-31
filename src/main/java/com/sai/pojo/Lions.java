package com.sai.pojo;

public class Lions extends TigerBean {
	protected void setProperties(int age,String n) {
		setAge(age);
		name = n;
	}
	public void roar() {
		System.out.println(name+", age"+getAge()+", says:Roar!");
	}
	public static void main(String[] args) {
		 Lions ar =new Lions();
		 ar.setProperties(23, "komal");
		 ar.roar();
		
	}

}
