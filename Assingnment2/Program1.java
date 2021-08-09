package com.techment.Assingnment2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int max1,max2,min1,min2,i,temp;
				for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
				max1=a[0];
				max2=a[1];
				if(max1<max2)
				{
					temp=max1;
					max1=max2;
					max2=temp;
				}
				for(i=2;i<n;i++)
				{ 
					if(a[i]>max1)
				{
						max2=max1;
					max1=a[i];
				}
					else if(a[i]>max2&&a[i]!=max1)
					{
						max2=a[i];
					}
				}
								
				min1=a[0];
				min2=a[1];
				if(min1>min2)
				{
					temp=min1;
					min1=min2;
					min2=temp;
				}
				for(i=2;i<n;i++)
				{ 
					if(a[i]<min1)
				{
						min2=min1;
					min1=a[i];
				}
					else if(a[i]<min2&&a[i]!=min1)
					{
						min2=a[i];
					}
				}
				System.out.println("The first largest number = "+max1);
				System.out.println("The second largest number = "+max2);
				System.out.println("The first smallest number = "+min1);
				System.out.println("The second smallest number = "+min2);
				
		
		
		
		
		
		
	

	}

}
