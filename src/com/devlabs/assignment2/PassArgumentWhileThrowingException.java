package com.devlabs.assignment2;


import java.util.*;

public class PassArgumentWhileThrowingException {
	public static void main(String[] args) throws ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to be divided by 3 : ");
		int num1 = scanner.nextInt();

		int result = num1 % 3;

		try {
			if (result != 0) {
				throw new ArithmeticException("The input number is not divisible by 3");
			} else {
				System.out.println("The input number is divisible by 3");
			}

			System.out.println("Enter another number to be divided by 3 : ");
			int num2 = scanner.nextInt();
			scanner.close();
			int result2 = num2 % 3;

			if (result2 != 0) {
				throw new ArithmeticException("The input number is divisible by 3");
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}