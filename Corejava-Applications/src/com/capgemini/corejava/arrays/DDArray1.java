package com.capgemini.corejava.arrays;

public class DDArray1 {

	public static void main(String[] args) {
		int[][] a=new int[5][5];
		int i,j;
		for(i=0;i<5;i++)
			for(j=0;j<5;j++)
				a[i][j]=7;
		for(i=0;i<5;i++)
		{
			System.out.println();
		for(j=0;j<5;j++)
			System.out.print("\t"+a[i][j]);
		}
	}

}
