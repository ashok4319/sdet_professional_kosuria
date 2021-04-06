package com.devlabs.assignment3;

import java.util.ArrayList;
import java.util.HashMap;

public class MapToList {
public static void main(String args[])
	
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(102, "Amit"); 
		hm.put(100, "Suman");
		hm.put(101, "Suneetha");
		hm.put(104, "Prithvi");
		hm.put(105, "Parusuram");

		System.out.println("After invoking put() method " + hm);

		 ArrayList<Integer> keyList = new ArrayList<Integer>(hm.keySet());
	     ArrayList<String> valueList = new ArrayList<String>(hm.values());

	     System.out.println("\n \n contents of the list holding keys the map ::"+keyList);
	     System.out.println("\n \n contents of the list holding values of the map ::"+valueList);
		
	}

}
