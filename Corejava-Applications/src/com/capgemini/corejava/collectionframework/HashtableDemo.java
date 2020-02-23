package com.capgemini.corejava.collectionframework;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable myMap= new Hashtable();
		myMap.put(100,"raju");
		myMap.put(200, "ravi");
		myMap.put("add", "MyAddress");
		myMap.put(99, "Custom");
		//myMap.put(null, null);
		System.out.println(myMap);
	}

}
