package com;

import java.util.Scanner;

public class Ternary
{
	public static void main(String[] args)
	{
		int a,b,c;
		int max;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the second number");
		b=sc.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the third number");
		c=s2.nextInt();
		
		max=(a > b)?(a < c ? a : c):(b > c ? b : c);
		
		System.out.println("maximum number is"+max);
	}
	
}
