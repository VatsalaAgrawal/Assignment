package com.techment.demo;

import java.util.Scanner;

public class Looping1 {
	public static void main(String args[])
	{
		int i;
		Scanner scanner=new Scanner(System.in);
		int TableName=scanner.nextInt();
		int limit=scanner.nextInt();
		for(i=1;i<=10;i++)
		{
	System.out.println(+TableName+ "*" +i+ "=" +(TableName*i));
		}

		
	}

}
