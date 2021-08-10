package com.techment.Day7.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListHW1 {

	public static void main(String[] args) {
				ArrayList<String> a=new ArrayList<String>();
		a.add("sachin");
		a.add("ravi");
		a.add("kumar");
		a.add("sowmya");
		System.out.println("Batch 1 members-"+a);
		
				ArrayList<String> a1=new ArrayList<String>();
		a1.add("sourab");
		a1.add("manish");
		a1.add("sachin");
		a1.add("ankit");
		a1.add("kumar");
		System.out.println("Batch 2 members-"+a1);
	a1.addAll(a);
	System.out.println("Batch 1 & Batch 2 members-"+a1);
	
	ArrayList<String> newList=new ArrayList<String>();
	
	{
		for(String name:a1)
		{
			if(!newList.contains(name))
			{
				newList.add(name);
			}
		}
		System.out.println("After Removing Duplicate Elements"+newList);
	
		Collections.sort(newList);
		System.out.println("After Sorting"+newList);
		
	}
		
		
		
		


	}

}
