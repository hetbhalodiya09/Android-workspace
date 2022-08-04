package com_18;
import java.util.Scanner;

public class squarecube 
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		
		 int add = a*a;
		 int add2 = a*a*a;
		
		System.out.println("square = " +add);
		System.out.println("cube = " +add2);
		
	}
}
