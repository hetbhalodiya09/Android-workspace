package com;

import java.util.Scanner;

public class Leapyear 
{
	public static void main(String[] args) 
	{
		int a;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		a=sc.nextInt();
		
		if(a%4==0)
		{
			System.out.println("this year is leapyear");
		}
		else
		{
			System.out.println("this year is not leap year");
		}
		
	}
}
