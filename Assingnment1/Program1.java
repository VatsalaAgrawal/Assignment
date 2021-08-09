package com.techment.Assingnment1;

import java.util.Scanner;

public class Program1 {
	public static void main(String args[])
	{
		int sum=0,b;
				Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a>0&&a<=18) {
		while(a>0)
		{
			b=a%10;
			a=a/10;
			sum=sum+b;
		}
		System.out.println("The exit door number of the glasshouse="+sum);
		}
		else {
			System.out.println("INVALID INPUT");
			
		}
	}


}
