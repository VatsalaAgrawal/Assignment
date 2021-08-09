package com.techment.Assingnment1;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
		int i,sum=0;
	int product[]=new int[n];
	System.out.println("Enter Product Name");
	for(i=0;i<n;i++)
{
	product[i]=scanner.nextInt();
	sum=sum+product[i];
	}
	System.out.println("Sum of all products = "+sum);

	}

}
