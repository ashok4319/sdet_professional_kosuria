package com.devlabs.assignment1;

import java.util.Scanner;

//import com.devlabs.lab1.Rectangle;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle r= new AreaOfRectangle();
		double area;
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Base of the Tringle : ");
        int base = reader.nextInt();
        System.out.println("Enter the Hight of the Tringle : ");
        int height = reader.nextInt();
        reader.close();
		
		//area=length*width;
		//System.out.println("Area of the rectangle : " + area);
		area=r.getArea(base,height);
		System.out.println("Area of the rectangle : " + area);
	}
	
	public double getArea(int a,int b)
	{
		return ((a*b)/2);
	}
	
}
