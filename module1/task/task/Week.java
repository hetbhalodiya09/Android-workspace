package com;

import java.util.Scanner;

public class Week 
{
	public static void main(String[] args) 
	{
		int num ;
		System.out.println("enter the number");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		
		switch(num)
		{
		
			case 1:System.out.println("Monday");
			break;
		
			case 2:System.out.println("Tuesday");
			break;
		
			case 3:System.out.println("Wednesday");
			break;
		
			case 4:System.out.println("Thursday");
			break;
		
			case 5:System.out.println("Friday");
			break;
		
			case 6:System.out.println("Saturday");
			break;
		
			case 7:System.out.println("Sunday");
			break;
		}
	}
}
