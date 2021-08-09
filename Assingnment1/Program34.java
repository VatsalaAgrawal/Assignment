package com.techment.Assingnment1;

import java.util.Scanner;

public class Program34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
				
		}

	}

}
