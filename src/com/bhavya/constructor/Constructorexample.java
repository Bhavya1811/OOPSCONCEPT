package com.bhavya.constructor;


class Calc {
	
	int num1;
	int num2;
	int result;
	
	//default constructor
	public Calc( ) {
		num1=5;
		num2=10;
		
		System.out.println("in Constructor");
	}
	//parameterized
	public Calc(int n) {
		num1=n;
		num2=n;
	}
	
	//parameterized constructor    
	public Calc(double d, int n) {
		num1=(int)d;
		num2=n;
	}
}

public class Constructorexample {

	public static void main(String[] args) {
		
		Calc cal=new Calc(9.5, 8);
		System.out.println(cal.num1);
		
	}

}
