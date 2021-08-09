package com.techment.Assingnment1;

import java.util.Scanner;

public class Program6 {
	public static void main(String args[])
	{
		double c;
		Scanner sc=new Scanner(System.in);
		double input1=sc.nextDouble();
		char operator=sc.next().charAt(0);
		double input2=sc.nextDouble();
		switch(operator)
		{
		case '+':
		{
		c=input1+input2;	
			System.out.println(+input1+ "+" +input2+ "=" +c);
			break;
		}
		case '-':
		{
		c=input1-input2;	
			System.out.println(+input1+ "-" +input2+ "=" +c);
			break;
		}
		case '*':
		{
		c=input1*input2;	
			System.out.println(+input1+ "*" +input2+ "=" +c);
			break;
		}
		case '/':
		{
		c=input1/input2;	
			System.out.println(+input1+ "/" +input2+ "=" +c);
			break;
		}
		}
				
	}



}
