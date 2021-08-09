package com.techment.Assingnment1;

import java.util.Scanner;

public class Program39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][]a=new int[m][n];
		int[][]b=new int[m][n];
		int[][]c=new int[m][n];
		int i,j,sum=0;
		System.out.println("Enter INPUTS OF FIRST ARRAY");
		for(i=0;i<a.length;i++)
	    {
	        for(j=0;j<a[i].length;j++)
	        {
a[i][j]=sc.nextInt();
	}
	    }
		System.out.println("Enter INPUTS OF SECOND ARRAY");
		for(i=0;i<b.length;i++)
	    {
	        for(j=0;j<b[i].length;j++)
	        {
b[i][j]=sc.nextInt();
	}
	    }
		System.out.println("ADDING TWO MARTRIX-");
		for(i=0;i<a.length;i++)
	    {
	        for(j=0;j<b.length;j++)
	        {
	        	c[i][j]=a[i][j]+b[i][j];
	        	System.out.print(c[i][j]+" ");

	}
	        System.out.println();
	    }
	}
}
