package com.capgemini.corejava.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try
		{
			String name=null;
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e1) {
			System.out.println("I can handle exception:"+e1);
		}
	}

}
