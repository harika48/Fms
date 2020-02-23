package com.capgemini.corejava.exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try
		{	int n=10;
			String name= null;                                               
			System.out.println("One");
			System.out.println(name.length());
			int t=n/2;
			System.out.println("End");
		}
		catch(NullPointerException e1) {
			System.out.println("I can handle exception:"+e1);
		} 
		catch(ArithmeticException e2)
		{
			System.out.println("I can handle exception:"+e2);
		}
	}

}
