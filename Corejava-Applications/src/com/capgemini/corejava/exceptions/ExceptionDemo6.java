package com.capgemini.corejava.exceptions;

public class ExceptionDemo6 {
	public void myPrint() throws Exception
	{
		String name=null;
		System.out.println(name.length());
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo6 ed6=new ExceptionDemo6();
		ed6.myPrint();
	}
		catch(Exception e)
		{
			System.out.println("I can handle:"+e);
		}
}
}

