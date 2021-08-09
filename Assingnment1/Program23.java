package com.techment.Assingnment1;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		float BMI;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weight");
		float weight=sc.nextFloat();
		System.out.println("Enter height");
		float height=sc.nextFloat();
		BMI=weight/(height*height);
		System.out.println(BMI);
		if(BMI<18.5)
		{
			System.out.println("Underweight");
		}
		else if(BMI>=18.5 && BMI<=25)
		{
			System.out.println("Normal");
		}
		else if(BMI>25 && BMI<=30)
		{
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
		
		
	

	}

}
