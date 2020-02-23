package com.capgemini.corejava.exceptions;

public class ExceptionDemo4 {
	public void myPrint()
	{
		try
		{	int n=10;
		System.out.println("Open DB connection");
			String name= null;                                               
			System.out.println("One");
			System.out.println(name.length());
			int t=n/2;
			System.out.println("End");
			System.out.println("Close DB connection");
		}
		catch(NullPointerException e1) {
			System.out.println("I can handle exception:"+e1);
		} 
		catch(ArithmeticException e2)
		{
			System.out.println("I can handle exception:"+e2);
		}
		catch(Exception e3)
		{
			System.out.println("I can handle exception:"+e3);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo4 ed4=new ExceptionDemo4();
		ed4.myPrint();
	}
}
