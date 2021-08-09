package com.techment.Assingnment1;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int []a=new int[n];
	int []b=new int[n];
	int i,j,flag=0;
	System.out.println("Enter inputs of first array");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter inputs of second array");
	for(i=0;i<n;i++)
	{
		b[i]=sc.nextInt();
	}
	for(i=0;i<a.length;i++)
	{
		flag=0;
		for(j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				flag=1;
			}
		}
	}
	if(flag==1)
			
			{
		System.out.println("SAME");
			}
	else
	{
		System.out.println("DIFFERENT");
		}
	}

	}

