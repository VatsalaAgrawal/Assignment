package com.techment.Test2;

import java.util.Scanner;

public class RepeatEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(	System.in);
		String str="llollollo";
		for(int i=0;i<3;i++) {
			System.out.println("Enter value of n");
			int n=sc.nextInt();
			RepeatEnd r=new RepeatEnd();
		System.out.println(r.repeatEnd(str, n));

	}
		

	}
	public String repeatEnd(String str, int n)
	{
		String s="";
		int l=str.length();
		l=l-n;
		for(int i=n;i>0;i--)
		{
			s=s+str.substring(l);
		
	
	}
		return s;

}




	}

