package com.bhavya.interfaces;

public class StateBank implements Bank{
	
	public void deposit()
	{
		System.out.println("StateBank : Deposit upto 20 lakhs");
	}

	
	public void withdraw() {
		
		System.out.println("StateBank: Withdraw upto 10 lakhs");
		
	}

	
	public void loan() {
		System.out.println("StateBank : loan upto 5 lakhs");
		
	}

	
	public void interest() {
		
		System.out.println("StateBank : Interest is 2 % per Annum");
		
	}
	
	

}

