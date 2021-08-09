package com.techment.Assingnment1;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		int b,p=0;
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int input=s;
		while(input!=0)
		{
			b=input%10;
			input=input/10;
			p=p+b*b*b;
			
		}
		if(p==s)
		{
			System.out.println(+s+" Armstrong Number");
		}
		else {
			System.out.println(+s+" not a Armstrong Number");
		}
		

	}



}
