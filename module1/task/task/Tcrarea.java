package com27;

import java.util.Scanner;

public class Tcrarea 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter 1 for area of Triangle");
		System.out.println("Enter 2 for area of Circle");
		System.out.println("Enter 3 for area of Rectangle");
		System.out.println("Enter the number what do you want to perform");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num==1)
		{
			System.out.println("Enter the value of base...");
			System.out.println("Enter the value of height...");
			int b=sc.nextInt();
			int h=sc.nextInt();
			System.out.println("Area of Triangle is ..."+0.5*b*h);
		}
		
		else if(num==2)
		{
			System.out.println("Enter the value of radius...");
			int r=sc.nextInt();
			System.out.println("Area of circle is..."+3.14*r*r);
		}
		else if(num==3)
		{
			System.out.println("Enter the value of length...");
			System.out.println("Enter the value of width...");
			int l=sc.nextInt();
			int w=sc.nextInt();
			System.out.println("Area of reactangle is..."+l*w);
		}
		else
		{
			System.out.println("the number you have entered is invalid");
		}
	}
}
