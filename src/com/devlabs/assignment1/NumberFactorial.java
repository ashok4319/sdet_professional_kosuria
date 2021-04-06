package com.devlabs.assignment1;
import java.util.Scanner;

	public class NumberFactorial {
		public void getAndPrintFactoria(int num) {
			double fact=1;
	        String display="("+num+"!)=1" ;
	        
	        int i=1;//initialization
	        while(i<=num) //No number is divisible by more than its half //test expresssion
	        {
	          fact=fact*i;  
	          if (i==1){
	          
	          }
	          else {
	        	  display=display+"*"+i;
	          }
	          i++;//update the condition
	        }
	        
	        System.out.println("Factorial of the number is "+display+"="+fact);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = reader.nextInt();
        reader.close();
        NumberFactorial nf=new NumberFactorial();
        nf.getAndPrintFactoria(num);
        		
        }

}
