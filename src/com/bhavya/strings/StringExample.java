package com.bhavya.strings;

public class StringExample {

	public static void main(String[] args) {
		
		String s="Java";
		System.out.println(s);
		s.concat("program");
		System.out.println(s);
		String s1=s.concat("Program !!");
		System.out.println(s1);
		
		System.out.println(s1.toString());
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.isEmpty());
		System.out.println(s1.getClass());
		System.out.println(s1.equalsIgnoreCase(s1));
		

	}

}
