package com.bhavya.interfaces;

public class HdfcBank implements Bank{

	
	public void deposit() {
		
		System.out.println("HdfcBank : Deposit upto 10 lakhs" );
		
	}

	
	public void withdraw() {
		
		System.out.println("HdfcBank : Withdraw upto 8 lakhs");
		
	}

	
	public void loan() {
		
		
		System.out.println("HdfcBank : loan upto 5 lakhs");
	}

	
	public void interest() {
		
		System.out.println("HdfcBank : Interest is 3 % per Annum");
		
	}

}
