package com.icici.loans.carloans;

public class sbi  implements Rbi {

	public static void main(String[] args) {
		sbi p = new sbi();
		p.deposit();
		p.deposit();
		p.withdraw();
	}

	@Override
	public void withdraw() {
	System.out.println(" iam overridden withdraw of sbi");
	}

	@Override
	public void deposit() {
	System.out.println(" iam over rideen deposit of sbi");	
		
	}

}
