package com88;

import java.util.Scanner;

public class Age 
{
	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("you are eligible");
		}
			
		else
		{
			try
			{
				throw new MyException();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
	  validate(2);	
	}
}
