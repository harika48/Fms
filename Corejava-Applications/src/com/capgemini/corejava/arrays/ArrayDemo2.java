package com.capgemini.corejava.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDemo2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int marks[]=new int[5];
		System.out.println("Enter 5 Students Marks");
		for (int i=0;i<5;i++)
		{
			marks[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<5;i++)
			System.out.println(marks[i]);
	}
 
}
