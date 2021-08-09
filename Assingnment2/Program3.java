package com.techment.Assingnment2;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter size");
			int n=sc.nextInt();
			int i;
			int a[]=new int[n];
						for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
						System.out.println("Elements in Ascending Order-");
Arrays.sort(a);
						for(i=0;i<n;i++)
						{
							System.out.println(a[i]);
						}

	}

}
