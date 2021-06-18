package com.bhavya.interfaces;

public class Test {

	public static void main(String[] args) {
		
		StateBank bank =new StateBank();
		bank.deposit();
		bank.withdraw();
		bank.loan();
		bank.interest();
		
		HdfcBank bank1=new HdfcBank();
		bank1.deposit();
		bank1.withdraw();
		bank1.loan();
		bank1.interest();
	}

}
