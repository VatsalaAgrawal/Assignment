package com.techment.Assingnment1;

import java.util.Scanner;

public class Program2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date");
		int date=sc.nextInt();
		System.out.println("Enter Registration Number");
		int RegisterNumber=sc.nextInt();
		if(date>0&&date<=31)
		{
		if(RegisterNumber%2==0&&date%2==0)
		{
			System.out.println("Cars with Even registration numbers are permitted today");
		}
		else {
			
			System.out.println("Cars with Odd registration numbers are permitted today");
		}
	}
		else
		{
			System.out.println("Invalid Input");
		}
		}

}
