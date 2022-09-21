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
		System.out.println("enter the mark of Gujarati:");
		a=sc.nextInt();
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the mark of maths:");
		b=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the mark of hindi:");
		c=s2.nextInt();
		
		Scanner s3=new Scanner(System.in);
		System.out.println("enter the mark of english:");
		d=s3.nextInt();
		
		Scanner s4=new Scanner(System.in);
		System.out.println("enter the mark of computer:");
		e=s4.nextInt();
		
		total=a+b+c+d+e;
		
		System.out.println("total="+total);
		percentage=total/5;
		System.out.println("percentage="+percentage);
		
		if(percentage>75)
		{
			System.out.println("distriction");
		}
		
		else if(percentage>60 && percentage<=75)
			
		{
			System.out.println("first class");
		}
		else if (percentage>50 && percentage<=60)
			
		{
			System.out.println("second class");
		}
		
		else if(percentage>60 && percentage<=50)
		{
			System.out.println("pass class");
		}
		
		else
		{
			System.out.println("Fail");
		}
	}
}

