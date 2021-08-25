package com.techment.Day11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the DOB");
		String dob=sc.next();
		System.out.println("Your birth date"+dob);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("yy/MMM/dd");
		LocalDate birthDate=LocalDate.parse(dob,d);
		System.out.println("Birthday: "+birthDate);
		
		
		System.out.println("Birth date in given format :"+birthDate.format(d));
		
		
		

	}

}
