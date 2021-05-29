package com.icici.loans.carloans;

public class SecondClass {
   int a=20,b=30,c;
   public void add(){
	   c=a+b;
	   System.out.println("addition of a&b;"+c);
   }
   public void sub() {
	   c=b-a;
	   System.out.println("subtraction of b&a:"+c);
   }
	public static void main(String[] args) {
		SecondClass san= new SecondClass();
		san.add();
		san.sub();
		SecondClass san2= new SecondClass();
		san2.add();
		san2.sub();
	}

}

