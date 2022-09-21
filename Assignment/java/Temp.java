package com;

import java.util.Scanner;

public class Temp
{
 public static void main(String[] args) 
 {
	 float t;
	 double temprature;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the pemprature in celcsius:");
	 t=sc.nextFloat();
     temprature=((t*9)/5)+32;
     System.out.println("the temprature in feranhit is:"+temprature);
 }
 
}
