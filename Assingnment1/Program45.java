package com.techment.Assingnment1;

import java.util.Scanner;

public class Program45 {

	public static void main(String[] args) {
		int CorrectPIN=12345;
		int c=0;
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter PIN");
		int PIN=sc.nextInt();
	if(PIN==CorrectPIN)
	{
		System.out.println("PIN ACCEPTED,YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
		break;
	}
	else
	{
		c++;
	}
	if(c==3)
	{
		System.out.println("YOU HAVE RUN OUT OF TRIES.ACCOUNT LOCKED");
		break;
	
		
	}
	}

	}
}
