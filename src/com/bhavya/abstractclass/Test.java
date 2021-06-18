package com.bhavya.abstractclass;

public class Test {

	public static void main(String[] args) {
		Statebank bank1 = new Statebank();
		bank1.deposit();
		bank1.withdraw();
		bank1.loan();
		bank1.interest();
		
		
		HdfcBank bank2= new HdfcBank();
		bank2.loan();
		bank2.interest();

	}

}
