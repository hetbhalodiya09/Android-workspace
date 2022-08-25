package com;

import java.util.Scanner;

public class Primenumber 
{
	public static void main(String[] args) 
	{
		int no,i;
		int flag=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		no=sc.nextInt();
		
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag = 1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("this number is prime");
		}
		else
		{
			System.out.println("this number is not prime");
		}
	}
}
