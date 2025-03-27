package com.sai.pojo;

public class TestStudentBean {
	public static void main(String[] args) {
		StudentBean ar =new StudentBean();
		ar.setName("kiran");
		ar.setId(12);
		ar.setAge(23);
		ar.setAddress("kiran nagar first line");
		System.out.println("The student id is "+ar.getId()+" and Student name is "+ar.getName()+" age is "+ar.getage()+
				" address is "+ar.getAddress());
		
		
	}
}
