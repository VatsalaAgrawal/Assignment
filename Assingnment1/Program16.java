package com.techment.Assingnment1;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int price=sc.nextInt();
		if(price%8==0&&price%3==0)
		{
			System.out.println(+price+ "= divisble by 8 & 3");
		}
		else
		{
			System.out.println(+price+ "= not divisble by 8 & 3");
		}
		
	}

}
