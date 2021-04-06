package com.devlabs.assignment1;

public class FibonacciSeries {
	static String printSring;
	static int num1=0, num2=1;
	public int getNextNumofSeries(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fs=new FibonacciSeries();
		printSring="0,1";
		for(int i=2;i<10;i++) {
		
		int num3;
		num3=fs.getNextNumofSeries(num1, num2);
		printSring=printSring+","+num3;	
		num1=num2;
		num2=num3;
		}
		
		System.out.println("Fibonacci Series upto 10 : "+ printSring);
	}

}
