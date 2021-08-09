package com.techment.Assingnment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Program28 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int CorrectPIN=sc.nextInt();
		while(true)
	{
			System.out.println("Enter PIN");
		int PIN=sc.nextInt();
		if(PIN==CorrectPIN)
		{
			System.out.println("PIN Accepted sucessfully");
			break;
		}
	}
	
	
}
}
