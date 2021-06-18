package com.bhavya.strings;

public class StringBufferExample {

	public static void main(String[] args) {
		
		//StringBuffer sb=new StringBuffer("Java");
		StringBuilder sb=new StringBuilder("Java");
		System.out.println(sb);
		sb.append("Application development");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.toString());
		System.out.println(sb.getClass());
		System.out.println(sb.hashCode());

	}

}
