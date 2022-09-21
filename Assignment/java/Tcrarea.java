package com27;

import java.util.Scanner;

public class Tcrarea
{
	public static void main(String[] args) 
	{
		System.out.println("enter 1 for area of tringle");
		System.out.println("enter 2 for area of circle ");
		System.out.println("enter 3 for area of rectangle");
		System.out.println("enter the number what do you want to perform");
		
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1)
		{
			System.out.println("enter the value of base...");
			System.out.println("enter the value of height...");
			int b=sc.nextInt();
			int h=sc.nextInt();
			System.out.println("area of tringle is..."+0.5*b*h);
			
		}
		
		else if(num==2)
		{
			System.out.println("enter the value of radius...");
			int r=sc.nextInt();
			System.out.println("area of circle is"+3.14*r*r);
			
		}
		
		else if(num==3)
		{
			System.out.println("enter the value of lenght");
			System.out.println("enter the value of width");
			int l=sc.nextInt();
			int w=sc.nextInt();
			System.out.println("area of reactangle is..."+l*w);
		}
		else
		{
			System.out.println("the number you have  entered is invalid");
		}
	}
	
}
