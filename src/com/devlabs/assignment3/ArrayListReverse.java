package com.devlabs.assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
public static void main (String args[]) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
        
        //Add elements to Arraylist
        arrayList.add("A");
        arrayList.add("M");
        arrayList.add("I"); 
        arrayList.add("T");
        arrayList.add(4, "K");
        arrayList.add(5, "U");
        System.out.println("ArrayList contains...");  
        //display ArrayList elements using for loop
        for(int index=0; index < arrayList.size(); index++)
        System.out.println("Element at "  +index +" is " + arrayList.get(index));
    
        Collections.reverse(arrayList);
        
        System.out.println("\n \n Reverse ArrayList contains...");  
        //display ArrayList elements using for loop
        for(int index=0; index < arrayList.size(); index++)
        System.out.println("Element at "  +index +" is " + arrayList.get(index));
    
	}
}
