package com.devlabs.assignment1;

//import java.util.Scanner;

public class FirstTenPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner reader = new Scanner(System.in);
        System.out.println("Enter No of prime numbers to be displayed: ");
        int totalNum = reader.nextInt();
        reader.close();*/
		int totalNum=10;
		boolean flag=false;
		int counter;
		int num=3;
		System.out.println("First "+totalNum+" Prime nubmers are : ");
		System.out.print("2");
		for(counter=1;counter<totalNum;) {			
        	for (int i=2;i<=num/2;i++)
        	{
        		if(num%i == 0)
	            { 
	                flag = true;
	                break;
	            }
        	}
        	if ( num==3){
        		flag=false;
        	}
    		
            if (!flag){
            	//varPrint=varPrint +num+",";
            	counter++;
            	System.out.print(","+num);
        	}	
            num++;
            flag=false; 
		}
	}
}
