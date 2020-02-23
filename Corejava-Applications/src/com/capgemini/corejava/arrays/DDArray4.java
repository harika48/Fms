package com.capgemini.corejava.arrays;

public class DDArray4 {

	public static void main(String[] args) {
		int[][] a=new int[5][5];
		int i,j;
		for(i=0;i<5;i++)
			for(j=0;j<5;j++)
				if(i==j||i+j==4)
				a[i][j]=7;
				else
					a[i][j]=0;
		for(i=0;i<5;i++)
		{
			System.out.println();
		for(j=0;j<5;j++)
			System.out.print("\t"+a[i][j]);
		}
	}

}
