package com.techment.Assingnment1;

import java.util.Scanner;

public class Program44 {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 Sides");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
     double c=sc.nextDouble();
     double S,A;
     S=(a+b+c)/2;
     A=Math.sqrt(S*(S-a)*(S-b)*(S-c));
System.out.println("Area of Triangle="+A);
	}
}

