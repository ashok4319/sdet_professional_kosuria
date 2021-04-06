package com.devlabs.assignment1;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter No of natual numbers to be added: ");
        int totalNum = reader.nextInt();
        reader.close();
    //    int totalNum=20;
        int sum=0;
        for(int i=1;i<=totalNum;i++) {
        	sum=sum+i;
        	if(i==totalNum){
        		System.out.print(i);
        	}
        	else {
        		System.out.print(i+"+");
        	}
        }
        System.out.println("="+sum);
	}

}
