package com;

import java.util.Scanner;

public class Interest 
{
	public static void main(String[] args)
	{
		float p,r,t;
		double interest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of p:");
		p=sc.nextFloat();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of r:");
		r=s1.nextFloat();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the value of t:");
		t=s2.nextFloat();
		interest=p*r*t/100;
		System.out.println("the simple interest is :"+interest);
		
	}
}
