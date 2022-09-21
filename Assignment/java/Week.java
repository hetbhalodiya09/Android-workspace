package com;

import java.util.Scanner;

public class Week 
{
	public static void main(String[] args) 
	{
		int num= 2;
		
		System.out.println("enter the number");
		
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		
		switch(num)
		{
				
		case 1: System.out.println("monday");
		break;
		
		case 2 : System.out.println("tuesday");
		break;
		
		case 3: System.out.println("wednesday");
		break;
		
		case 4: System.out.println("thursday");
		break;
		
		case 5: System.out.println("friday");
		break;
		
		case 6: System.out.println("saturday");
		break;
		
		case 7: System.out.println("sunday");
		break;
		
	}
	}
}
