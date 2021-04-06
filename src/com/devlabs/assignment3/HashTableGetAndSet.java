package com.devlabs.assignment3;

import java.util.Hashtable;
import java.util.Set;

public class HashTableGetAndSet {
	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "text 1");
		map.put(102, "text 2");
		map.put(111, "text 3");
		map.put(103, "text 4");

		Set<Integer> keys = map.keySet();

		for (int i : keys) {
			System.out.println("For key " + i + ", the value is: " + map.get(i));

		}

	}
}
