package com.capgemini.corejava.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(100,"raju");
		hm.put(200, "ravi");
		hm.put(300, "MyAddress");
		hm.put(99, "Custom");
		hm.put(null, null);
		//
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
	}

}
