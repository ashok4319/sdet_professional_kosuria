package com.devlabs.assignment2;

public class ConvertString {
	
	public static void main(String[] args) {
		
		String str1="Amit.Nayak@BROADRIDGE.COM";
		System.out.println("Entered String is:  "+str1);
		
		char arr[]=str1.toCharArray();
		
		System.out.println("\nString after converted to character array:");
		for(char ch: arr) {
			System.out.print(ch+" ");
		}
		
		String str2=new String(arr);
		
		System.out.println("\n\nCharacter array after converted to String:\n"+str2);
		

	}

}