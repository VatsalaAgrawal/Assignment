package com.techment.Assingnment1;

import java.util.Scanner;

public class Program30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String message=sc.nextLine();
		int i,c=0,f=0;
			for(i=0;i<message.length();i++)
		{
			if(message.charAt(i)==' ')
			{
		
			}
			
			else {
				c++;
			}
		}
		System.out.println("Total no. of characters ="+c);
		System.out.println("First characters ="+message.charAt(0));
		System.out.println("Last characters ="+message.charAt(message.length()-1));
		for(i=0;i<message.length();i++)
		{
			if(message.charAt(i)=='a')
			{
				f++;
			}
		}
		System.out.println("Total no. of times character a present =  ="+f);
		
	}

}
