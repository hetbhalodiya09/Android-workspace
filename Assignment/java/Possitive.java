package com;

import java.util.Scanner;

public class Possitive 
{
	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
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
