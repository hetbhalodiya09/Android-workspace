package com;

import java.util.Scanner;

public class Temp 
{
	public static void main(String[] args) 
	{
		float t;
		double temperature;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in celsius: ");
		t=sc.nextFloat();
		temperature=((t*9)/5)+32;
		System.out.println("The temperature in feranhit is :"+temperature);
	}
}
