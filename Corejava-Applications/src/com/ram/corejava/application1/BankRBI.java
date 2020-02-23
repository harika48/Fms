package com.ram.corejava.application1;
public class BankRBI {
	static{
		System.out.println("Welcome Employee Details");
	}
	BankRBI()
	{
		System.out.println("RBI BANK Home Loan and Personal Loan Interests rates..");
	}
    BankRBI(double   p ,double r)
	{
		System.out.println(p*r/100);
	}
 public static final  void getBankDetails()
	{
		System.out.println("Home Loan In 11 %");
	    System.out.println("Personal Interest 16%");
	}
}










