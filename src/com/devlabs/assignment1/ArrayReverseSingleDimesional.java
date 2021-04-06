package com.devlabs.assignment1;

import java.util.Scanner;

public class ArrayReverseSingleDimesional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int arrLen = reader.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[arrLen]; //declaration
        int[] revArr=new int[arrLen];
        for(int i=0;i<arrLen;i++)
        {
            arr[i] = reader.nextInt();
        }
        reader.close();
        System.out.println("Elements of original array: ");    
        for (int j = 0; j < arr.length; j++) {     
            System.out.print(arr[j] + " ");    
        }
        /*// If just printing without storing
        System.out.println("");
        System.out.println("Elements of array in reverse order: ");   
        for(int iLoop=arr.length-1;iLoop>=0;iLoop--) {
            System.out.print(arr[iLoop] + " ");    
        }
        */
    	for (int jLoop = 0; jLoop < arr.length; jLoop++) {
    		--arrLen;
    		revArr[jLoop]=arr[arrLen];
    	}	
        
        System.out.println("");
        System.out.println("Elements of array in reverse order: ");    
        for (int i = 0; i < revArr.length; i++) {     
            System.out.print(revArr[i] + " ");    
        } 
	}

}
