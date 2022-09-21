
package com;

import java.util.Scanner;

public class Triangle 
{
	public static void main(String[] args) 
	{
		float height;
		float base =0;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of triangle:");
		height=sc.nextFloat();
		Scanner s1=new Scanner(System.in);
		System.out.println("Entre the base of triangle:");
		base=s1.nextFloat();
		area=(height*base)/2;
		System.out.println("Area of triangle is ::"+area);
	}
}
