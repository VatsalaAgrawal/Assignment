package com.techment.Assingnment1;

import java.util.Scanner;

public class Program3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the weight of 1st Horse");
		int w1=sc.nextInt();
		System.out.println("Enter the weight of 2nd Horse");
		int w2=sc.nextInt();
		System.out.println("Enter the weight of 3rd Horse");
		int w3=sc.nextInt();
		int max=(w1>w2)?(w1>w3?w1:w3):(w2>w3?w2:w3);
	if(w1==w2&&w2==w3&&w3==w1)
	{
		System.out.println("Entered weights are not distinct values");
	}
	else
	{
		System.out.println("The weight of the horse with maximum weight="+max);	
	}
	}

}
