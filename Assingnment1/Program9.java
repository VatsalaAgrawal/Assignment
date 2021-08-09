package com.techment.Assingnment1;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scanner.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
			if(i!=n) {
			System.out.print((i*i*i) + ",");
		}
			else
			{
				System.out.print(i*i*i);
			}
		}
	}
}
