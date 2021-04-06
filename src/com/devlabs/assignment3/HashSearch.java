package com.devlabs.assignment3;

import java.util.Hashtable;
import java.util.Set;

public class HashSearch {
	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Kumar");
		map.put(111, "Nayak");
		map.put(103, "Asish");
		map.put(104, "Ranjan");
		map.put(105, "Patel");

		Set<Integer> keys = map.keySet();

		for (int i : keys) {
			System.out.println("For key" + i + ", the value is: " + map.get(i));

		}

		String str = "Amit";
		String str2 = "Nayak";

		if (map.containsValue(str)) {
			System.out.println("VALUE " + str + " found");
		} else {
			System.out.println("VALUE " + str + " NOT found");
		}

		if (map.containsValue(str2)) {
			System.out.println("VALUE " + str2 + " found");
		} else {
			System.out.println("VALUE " + str2 + " NOT found");
		}
		
	}

}
