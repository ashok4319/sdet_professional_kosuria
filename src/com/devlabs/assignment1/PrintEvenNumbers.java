package com.devlabs.assignment1;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner reader = new Scanner(System.in);
        System.out.println("Enter Upper Limit of even numbers to be displayed: ");
        int totalNum = reader.nextInt();
        reader.close();*/
		int totalNum=50;
		System.out.println("All the even numbers till '"+totalNum+"' are listed below:");
			
			for(int i=1;i<=totalNum;i++) {
				if ((i%2)==0) {
					System.out.print(i+",");
				}
			}

	}

}
