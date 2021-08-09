package com.techment.demo;

import java.util.Scanner;

public class Looping2 {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=scanner.nextInt();
		int marks[]=new int[n];
		int i,sum=0,max,min,max1,flag=0;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Marks");
			marks[i]=scanner.nextInt();
		}
		System.out.println("Marks- ");
		for(i=0;i<n;i++)
		{
			System.out.println(marks[i]);
			
		}
		for(i=0;i<n;i++)
		{
			sum=sum+marks[i];
			
		}
		System.out.println("sum="+sum);
		min=marks[0];
		for(i=0;i<n;i++)
		{
			if(marks[i]<min)
			{
				min=marks[i];
			}
			
		}
		System.out.println("Lowest marks="+min);
		max=marks[0];
		for(i=0;i<n;i++)
		{
			if(marks[i]>max)
			{
				max=marks[i];
			}
			
		}
		System.out.println("Highest marks="+max);
		
		max1=marks[1];
		for(i=0;i<n;i++)
		{
			if(marks[i]>max1&&marks[i]!=max)
			{
				max1=marks[i];
			}
			
		}
		System.out.println("Second Highest marks="+max1);
		for(i=0;i<n;i++)
		{
			if(marks[i]>40)
			{
				flag++;
			}
		}
		if(flag==n)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
	}

}
