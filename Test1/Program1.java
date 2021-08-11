package com.techment.Test1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter size-");

	int n=scanner.nextInt();
	int []age=new int[n];
	System.out.println("Enter Age-");
	int i,c=0,a=0,s=0;
	for(i=0;i<n;i++)
	{
		age[i]=scanner.nextInt();
	}
	for(i=0;i<n;i++)
	{
		if(age[i]<18)
		{
			c++;
		}
		else if(age[i]>=18 && age[i]<=54)
		{
			a++;
		}
		else if(age[i]>=55)
		{
			s++;
		}
	}
	System.out.println("Children : "+c);
	System.out.println("Adult : "+a);
	System.out.println("Senior Citizen : "+s);
	

	}

}
