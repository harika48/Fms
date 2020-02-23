package com.capgemini.corejava.collectionframework;

import java.util.HashSet;

public class ForEachDemo {

	public static void main(String[] args) {
		HashSet<String> myset=new HashSet<String>();
		myset.add("Tom");
		myset.add("krish");
		myset.add("balu");
		myset.add("raj");
		System.out.println("The set elements are:");
		for(String name:myset) {
			System.out.println(name);
		}
		
	}

}
