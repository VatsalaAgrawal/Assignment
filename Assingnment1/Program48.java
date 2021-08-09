package com.techment.Assingnment1;

import java.util.Scanner;

public class Program48 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp,d=0,n=0;
		System.out.println("Enter Binary Number-");
		int value=sc.nextInt();
		while(true)
		{
			if(value==0)
			{
				break;
			}
			else {
				temp=value%10;
				d += temp*Math.pow(2, n);
				value=value/10;
				n++;
			}
		}
		System.out.println("Decimal no="+d);
		

	}

}
