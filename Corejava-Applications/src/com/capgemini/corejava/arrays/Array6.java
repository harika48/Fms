package com.capgemini.corejava.arrays;

public class Array6 {

	public static void main(String[] args) {
		int[] a=new int[5];
		int i=0,x=5,sum=0;
		for(i=0;i<5;i++)
		{
			a[i]=x;
			sum=sum+a[i];
		
		x--;}
		System.out.println(sum);
		

	}

}
