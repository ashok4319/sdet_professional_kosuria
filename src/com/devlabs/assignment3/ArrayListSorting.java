package com.devlabs.assignment3;

import java.util.ArrayList;

public class ArrayListSorting {
	public static void main(String[] args) {

		// create an ArrayList object
		ArrayList<String> arrayList = new ArrayList<String>();

		// Add elements to Arraylist
		arrayList.add("Amit");
		arrayList.add("Suneetha");
		arrayList.add("Suman");
		arrayList.add("Prithvi");
		arrayList.add("Parusuram");
		arrayList.add("Jagadeesh");

		System.out.println("ArrayList contains...");

		for (int index = 0; index < arrayList.size(); index++)
			System.out.println("Element at " + index + " is " + arrayList.get(index));

		arrayList.sort(null);
		
		System.out.println("\n \n Array List after sort");
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println("Element at " + index + " is " + arrayList.get(index));

		
		
	}
}
