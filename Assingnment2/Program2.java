package com.techment.Assingnment2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
  int flag=0;
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size");
	int n=sc.nextInt();
	int a[]=new int[n];
				for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
				  System.out.println("Enter number");
					int searchNumber=sc.nextInt();
				
				for(i=0;i<n;i++)
				{
					if(searchNumber==a[i])
					{
						flag=1;
						break;
										}
				else {
					flag=0;
				}
	}
				if(flag==1)
				{
					System.out.println("The search elment is at index="+i);
				}
				else
				{
					System.out.println("The search elment is at index -1");
				}
	}
  

}

