package com.techment.Assingnment2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int i;
		  Scanner sc=new Scanner(System.in);
		  int u=0;
		  System.out.println("Enter size of first Array");
			int n=sc.nextInt();
			  System.out.println("Enter size of second Array");
			int p=sc.nextInt();
						int a[]=new int[n];
			int b[]=new int[p];
						int l=n+p;
						int mergeArray[]=new int[l];
			
						System.out.println("Enter elements of first Array -");
						for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
						System.out.println("Enter elements of Second Array -");
						for(i=0;i<p;i++)
						{
							b[i]=sc.nextInt();
						}
						for(int element:a)
						{
							mergeArray[u++]=element;
						}
						for(int element:b)
						{
							mergeArray[u++]=element;
						}
						System.out.println("Resultant Array -");
						for(i=0;i<u;i++)
						{
							System.out.print(mergeArray[i]+" ");
						}

	}

}
