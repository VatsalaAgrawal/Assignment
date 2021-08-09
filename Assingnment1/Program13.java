package com.techment.Assingnment1;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int i,max;
	int product[]=new int[n];
	System.out.println("Enter Product Name");
	for(i=0;i<n;i++)
{
	product[i]=scanner.nextInt();
	}
max=product[0];
for(i=0;i<n;i++)
{
	if(product[i]>max)
	{
		max=product[i];
	}
}
System.out.println("The Maximum among all products = "+max);

	
}
}