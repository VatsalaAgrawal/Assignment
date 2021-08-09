package com.techment.day6.exception;

import java.util.Scanner;

public class Exception3HW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int c=num1/num2;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
	}
}
