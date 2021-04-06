package com.devlabs.assignment1;

import java.util.Scanner;

public class ArraySortAscSingleDimesional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int arrLen = reader.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[arrLen]; //declaration
        
        for(int i=0;i<arrLen;i++)
        {
            arr[i] = reader.nextInt();
        }
        reader.close();
        System.out.println("Elements of original array: ");    
        for (int j = 0; j < arr.length; j++) {     
            System.out.print(arr[j] + " ");    
        } 
        for (int iLoop = 0; iLoop < arr.length; iLoop++) {     
            for (int jLoop = iLoop+1; jLoop < arr.length; jLoop++) {     
               if(arr[iLoop] > arr[jLoop]) {    
                   int temp = arr[iLoop];    
                   arr[iLoop] = arr[jLoop];    
                   arr[jLoop] = temp;    
               }     
            }     
        }
        System.out.println("");
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } 
	}

}
