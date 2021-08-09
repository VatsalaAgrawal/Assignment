package com.techment.Assingnment1;

import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
				
		}
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
				
		}
		

	}

}
