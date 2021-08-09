package com.techment.Assingnment1;

import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str)
	{
		System.out.println(str);
		
	}
}

public class Program17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
		if(age<18)
{
	throw new InvalidAgeException("Invalid age");
	
}
		else {
			System.out.println("Valid Age");
		}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	
}
}