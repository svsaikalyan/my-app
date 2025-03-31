package com.sai.pojo;

public class TestAnimalBean {
	public static void main(String[] args) {
		AnimalBean ar =new AnimalBean();
		ar.setName("krishnan");
		ar.setId(24);
		ar.setAge(27);
		ar.setAddress("sai nagar first line");
		ar.setHeight(5);
		System.out.println("The student id is "+ar.getId()+" and Student name is "+ar.getName()+" age is "+ar.getage()+
				" address is "+ar.getAddress()+ "height is "+ar.getheight());
	}

}
