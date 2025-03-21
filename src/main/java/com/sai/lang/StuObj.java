package com.sai.lang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class StuObj{
	public static void main(String arg[]){
		Student stu1 = new Student(1, "Ram");
		Student stu2 = new Student(1, "Ram");
		Student stu3 = new Student(2, "Lak");
		Course     c = new Course(1, "python");
		System.out.println(stu1);
		
		System.out.println("Stu1 hashCode is "+stu1.hashCode());
		System.out.println("Stu2 hashCode is "+stu2.hashCode());
		System.out.println("Stu3 hashCode is "+stu3.hashCode());
		System.out.println(stu1.equals(stu2));
		System.out.println("Stu1 and stu3 "+stu1.equals(stu3));
		
		Course d = new Course(1, "Python");
		//System.out.println(stu);
		System.out.println(c);
		System.out.println(c.hashCode());
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		
		System.out.println(stuList);
		
		Set<Student> stuSet = new HashSet<>();
		stuSet.add(stu1);
		stuSet.add(stu2);
		stuSet.add(stu3);
		
		System.out.println(stuSet);
	}
}

class Student{
	int id;
	String name;
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	public String toString(){
		return "Student Id is "+id+", name is "+name;
	}
}
class Course{
	int id;
	String name;
	public Course(int id, String name) {
		this.id =id ;
		this.name = name;
		
	}
	public String toString1(){
		return "Student Id is "+id+", name is "+name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
}