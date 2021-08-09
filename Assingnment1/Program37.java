package com.techment.Assingnment1;

import java.util.Scanner;

public class Program37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,l,k;
		for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=n-i;j++)
	        {
	           System.out.print(" ");
	        }

	        for(j=i;j>=1;j--)
	        {
	        	  System.out.print(j);
	        }

	        for(j=2;j<=i;j++)
	        {
	        	  System.out.print(j);
	        }
	        System.out.println();
	    }
		for(i=1;i<=n;i++)
	    {
	        for(j=i;j>=1;j--)
	        {
	           System.out.print(" ");
	        }

	        for(j=n-i;j>=1;j--)
	        {
	        	  System.out.print(j);
	        }

	        for(j=2;j<=n-i;j++)
	        {
	        	  System.out.print(j);
	        }
	        System.out.println();
	    }
		
	}
}


