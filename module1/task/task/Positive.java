package com;

import java.util.Scanner;

public class Positive
{
	public static void main(String[] args) 
	{
		float a;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("this number is positive");
		}
		if(a<0)
		{
			System.out.println("this number is negative");
		}
		if(a==0)
		{
			System.out.println("this number is zero");
		}
		
	}
}
