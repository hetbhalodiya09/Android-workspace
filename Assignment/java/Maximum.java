package com;

import java.util.Scanner;

public class Maximum 
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the second number");
		b=sc.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the third number");
		c=s2.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println(a+"is the maximum number");
		}
		else if (b>=a && b>=c)
		{
			System.out.println(b+"is this maximum number");
		}
		else
		{
			System.out.println(c+"is this maximum number");
		}
	}
}
