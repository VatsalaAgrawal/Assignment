package com.techment.Assingnment1;

import java.util.Arrays;
import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char []a=s1.toUpperCase().toCharArray();
		char []b=s2.toUpperCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result=Arrays.equals(a, b);
		if(result==true)
		
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}

	}

}
