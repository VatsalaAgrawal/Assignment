package com.techment.Assingnment2;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int m =sc.nextInt();
		int n =sc.nextInt();
		int i,j,sum=0;
		int a[][]=new int[m][n];
		System.out.println("Enter Elements of an array-");
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			sum=0;
			for(j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("sum of "+(i+1)+" Row ="+sum);
		}
		
		}

}
