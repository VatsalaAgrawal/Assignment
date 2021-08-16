package com.techment.Collection_Assignment3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		double sum=0;
		System.out.println("Enter number of Students");
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(true) {
		int marks=sc.nextInt();
		if(marks==-1)
				{
			break;
		}
		else
		{
			a.add(marks);
			c++;
		}
		

	}
		Integer max=Collections.max(a);
		System.out.println("Highest Marks : "+max);
		for(int i=0;i<a.size();i++)
		{
			sum +=a.get(i);
			
		}
		System.out.println("Average Marks :  "+(sum/a.size()));
		Iterator<Integer> i=a.iterator();
		System.out.print("Marks : ");
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		System.out.println("Marks obtained by 3rd Student : "+a.get(2));
		Collections.sort(a);
		System.out.println("Sorted : "+a);
		
		}
			
	}

