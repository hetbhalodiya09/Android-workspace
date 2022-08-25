package com;

import java.util.Scanner;

public class Fail 
{
	public static void main(String[] args) 
	{
		int a,b,c,d,e;
		int total;
		float percentage;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark of gujarati :");
		a=sc.nextInt();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the mark of maths :");
		b=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the mark of english :");
		c=s2.nextInt();
		
		Scanner s3=new Scanner(System.in);
		System.out.println("enter the mark of science :");
		d=s3.nextInt();
		
		Scanner s4=new Scanner(System.in);
		System.out.println("enter the mark of computer :");
		e=s4.nextInt();
		
		total=a+b+c+d+e;
		System.out.println("Total ="+total);
		
		percentage=total/5;
		System.out.println("Percentage ="+percentage);
		
		if(percentage>75)
		{
			System.out.println("Distinction");
		}
		
		else if(percentage>60 && percentage<=75)
		{
			System.out.println("First class");
		}
		
		else if(percentage>50 && percentage<=60)
		{
			System.out.println("Second class");
		}
		
		else if(percentage>35 && percentage<=50)
		{
			System.out.println("Pass class");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
	}
}
