package com.devlabs.assignment3;

import java.util.Iterator;
import java.util.TreeSet;

public class HighestAndLowestInTreeSet {
	 public static void main(String args[])
	    {
	        
	        TreeSet<Integer> set = new TreeSet<Integer>(); 
	        set.add(01);
	        set.add(13);
	        set.add(38);
	        set.add(81);
	        set.add(10);
	        set.add(99);
	        set.add(52);
	        set.add(111);
	        
	        System.out.println("Elements of the treeset are: " + set);
	        System.out.println("Traversing elements through Iterator");
	        
	        Iterator<Integer> i = set.iterator();
	        while (i.hasNext()) {
	            System.out.print(" " + i.next());
	        }
	        
	        System.out.println("\nLowest Value in Tree set is "+set.first());
	        System.out.println("Highest Value in Tree set is "+set.last());
	    }

}
