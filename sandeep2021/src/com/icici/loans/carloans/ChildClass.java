package com.icici.loans.carloans;

public class ChildClass extends Firstabstract {

	public static void main(String[] args) {
		ChildClass san = new ChildClass();
		san.m1();
		san.m2();

	}

	
	  public void m1(){
	  System.out.println(" iam m1 over rideenclass cocrete method"); }
	 
	@Override
	public void m2() {
		System.out.println(" iam overriden of m2");
		
	}

}
