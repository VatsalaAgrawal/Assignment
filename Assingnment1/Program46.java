package com.techment.Assingnment1;

import java.util.Scanner;

public class Program46 {

static double sum(int n)
{
	double sum=0;
	int fact=1,i;
	for(i=1;i<=n;i++) {
		fact=fact*i;
		
		sum=sum+1.0/ fact;
		
	}
	return sum;
	
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		System.out.println(sum(n));

	}

}
