package com.capgemini.corejava.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		 int [] a= {9,8,6,7,1};
		 int i, j,temp;
		 for(i=0;i<5;i++)
			 for(j=0;j<4-i;j++)
				 if (a[j]>a[j+1])
				 {
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
		 for(i=0;i<5;i++)
			 System.out.println("\t"+a[i]);
	}

}
