package com.devlabs.assignment1;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int strYear = reader.nextInt();
        reader.close();
        if (((strYear%4)==0 ) && ((strYear%100)!=0 )) {
        	System.out.println("given year "+strYear+" is a leap year.");
        }
        else {
        	System.out.println("given year "+strYear+" is not a leap year.");
        }
	}

}
