package com.devlabs.assignment1;

import java.util.Scanner;

public class PrintTringleUsingArrayTwoDimensional {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of line required for the tringle : ");
        int noOfLines = reader.nextInt();
        reader.close();
        
		// TODO Auto-generated method stub
		String[][] arr=new String[noOfLines][noOfLines];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<=i;j++) {
				arr[i][j]="0";
			}
		}
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]!=null) {
					System.out.print(arr[i][j]);
				}
				else {
					System.out.print("");
				}	
			}
			System.out.println("");
		}
	}

}
