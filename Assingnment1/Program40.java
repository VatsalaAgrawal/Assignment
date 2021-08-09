package com.techment.Assingnment1;

import java.util.Scanner;

public class Program40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][]a=new int[m][n];
		int i,j;
		System.out.println("Enter Inputs-");
		for(i=0;i<a.length;i++)
	    {
	        for(j=0;j<a[i].length;j++)
	        {
a[i][j]=sc.nextInt();
	}
	    }
		System.out.println("Mirror Image-");
		for(i=0;i<a.length;i++)
	    {
	        for(j=a[i].length-1;j>=0;j--)
	        {
System.out.print(a[i][j]+" ");
	        }
	
	        System.out.println();
	    }

	}

}
