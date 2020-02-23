package com.capgemini.corejava.collectionframework;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap myMap= new HashMap();
		myMap.put(100,"raju");
		myMap.put(200, "ravi");
		myMap.put("add", "MyAddress");
		myMap.put(99, "Custom");
		myMap.put(null, null);
		System.out.println(myMap);
	}

}
