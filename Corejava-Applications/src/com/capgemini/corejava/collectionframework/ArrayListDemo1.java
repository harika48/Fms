package com.capgemini.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		myList.add(100);
		myList.add(45.4);
		myList.add("ram");
		myList.add(100);
		//System.out.println(myList);
		Iterator i2=myList.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}

}
