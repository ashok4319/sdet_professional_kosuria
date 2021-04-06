package com.devlabs.assignment2;

public class FindRepeatedOccurence {

	public static int findoccurence(String str, char ch2) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch2) {
				count++;
			}
		}

		return(count);

	}
	
	 public static void main(String[] args) {  
	        String string1 = "THIS STRING IS USED TO FIND REPEATED OCCURANCE";  
	        int count;  
	          
	        //Converting given string into character array  
	        char string[] = string1.toCharArray();  
	        
	        System.out.println("Entered String:"+string1);
	        System.out.println("Repeated characters in a given string: ");  
	        //Counts each character present in the string  
	        for(int i = 0; i <string.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    
	                    string[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && string[i] != '0') { 
	            	int counter=findoccurence(string1,string[i]);
	            	System.out.println(string[i]+"  Count:"+counter);  
	            } /*else if (count == 1 && string[i] != '0') { 
	            	int counter=findoccurence(string1,string[i]);
	            	System.out.println(string[i]+"  Count:"+counter);  
	            	
	            }*/
	            	
	        }  
	    }  
	
	
}
