package com.bhavya.encapsulation;

class Student {
	
	private int rollno;
	private String name;
	private String address;
	private int age;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsulationexample {
	
	public static void main(String[]  args)
	{
		Student s1=new Student();
		s1.setRollno(10);
		s1.setName("Bhavya");
		s1.setAddress("Texas");
		s1.setAge(18);
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getAge());
		
	}

}
