package com.capgemini.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMarks {

	public static void main(String[] args) {
		ArrayList<Integer> myMarks=new ArrayList<Integer>();
		myMarks.add(65);
		//myMarks.add(45.5f);
		//System.out.println(myMarks);
		Iterator i3=myMarks.iterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
	}
	

}
