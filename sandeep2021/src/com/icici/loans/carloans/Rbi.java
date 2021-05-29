package com.icici.loans.carloans;

public interface Rbi {
 public void withdraw();
 public void deposit();
public static void main(String[] args) {
	/*
	 * Rbi f= new sbi(); f.withdraw(); f.withdraw(); f.deposit(); Rbi d = new
	 * icici(); d.deposit(); d.withdraw();
	 * 
	 */
	Rbi i;
	i = new icici();
	i.deposit();
	i.withdraw();
	 i= new sbi();
	 i.deposit();
	 i.withdraw();
	 
}
}
