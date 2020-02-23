package com.capgemini.corejava.exceptions;
class AgeNotSupportException extends Exception
{
	private static final long serialVersionUID = 1L;

	AgeNotSupportException (String msg)
	{
		System.out.println("Hello "+msg);
	}
}
public class UDemo {
	int age=15;
	public void myDisplay() throws AgeNotSupportException 
	{
		if (age<18)
			throw new AgeNotSupportException ("Not Eligible");
		else
			System.out.println("Eligible");
	}
	public static void main(String[] args) {
		try
		{
			UDemo ude=new UDemo();
			ude.myDisplay();
		}
		catch(Exception e4) {
			System.out.println(e4);
		}
	}
}

