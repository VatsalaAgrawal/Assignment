package com.techment.Test2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(	System.in);
		String str="Chocolate";
		for(int i=0;i<3;i++) {
			System.out.println("Enter value of n");
			int n=sc.nextInt();
		Program1 p=new Program1 ();
		System.out.println(p.repeatFront(str, n));
		
		}
	}

	public String repeatFront(String str, int n)
	{
		String s="";
		for(int i=n;i>=0;i--)
		{
			s=s+str.substring(0,i);
		
	
	}
		return s;

}
}
