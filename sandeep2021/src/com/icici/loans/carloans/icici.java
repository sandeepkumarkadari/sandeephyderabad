package com.icici.loans.carloans;

public class icici implements Rbi {

	public static void main(String[] args) {
	 icici s= new icici();
	 s.withdraw();
	 s.deposit();
	}

	@Override
	public void withdraw() {
	System.out.println(" iam overrideen withdraw of icici");
	}

	@Override
	public void deposit() {
		System.out.println(" iam over riden deposit of icici  ");
	}

}
