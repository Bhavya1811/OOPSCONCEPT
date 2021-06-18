package com.bhavya.polymorphism;

class Animal {
	
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {
	public void move() {
		System.out.println("Dogs can move and run");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Animal a=new Animal(); //Animal reference and object
		a.move(); //runs the method in animal class
		
		
		Animal a1=new Dog(); //Animal reference but dog object
		a1.move(); //runs the method in dog class

	}

}
