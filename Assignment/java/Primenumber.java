package com;

import java.util.Scanner;

public class Primenumber 
{
	public static void main(String[] args) 
	{
		int number,i;
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		
		for(i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag =1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("this numbetr is prime");
		}
		else
		{
			System.out.println("this number is not prime");
		}
		
	}
}
