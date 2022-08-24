package com;

import java.util.Scanner;

public class Percentage 
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
		
	}

	private static boolean a(int b, int c, int d, boolean e) {
		// TODO Auto-generated method stub
		return false;
	}
}
