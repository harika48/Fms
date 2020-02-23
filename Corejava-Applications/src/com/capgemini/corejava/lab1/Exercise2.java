package com.capgemini.corejava.lab1;
public class Exercise2 {
	public void calculateDifference(int n)
	{
		int x,y=0;
		int sum=0,sum2,sum1;
		for(int i=1;i<=n;i++) {
			 x=i*i;
			 sum=sum+x;
			 y=y+i;
	
		}
		sum2=y*y;
		sum1=sum-sum2;
		System.out.println("difference :"+sum1);
	}
 public static void main(String[] args) {
	Exercise2 ex2=new Exercise2();
	ex2.calculateDifference(4);
}
 }
