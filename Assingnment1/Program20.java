package com.techment.Assingnment1;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER SIZE");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		try {
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.print("Enter index");
		int index=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(i==index)
			{
				System.out.println("value of index "+index+ "="+a[i]);
				break;
			}
			else if(index>n)
			{
				throw new Exception();
			}
		}
		
		
	}
		catch(Exception e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}

}
}
