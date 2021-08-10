package com.techment.Day7.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
			a.add(1);
	a.add("Vatsala");
	a.add(12.50);
	a.add(12);
	a.add("Kavya");
	System.out.println(a);	
	a.add(1,"Ridhima");
	System.out.println("element at 1st position = "+a);	
	a.remove("Ridhima");
	System.out.println("Deleted Element = "+a);	
	a.remove(2);
	System.out.println("Deleted Element at index 2 = "+a);	
	a.remove(a.get(3));
	System.out.println("Deleted Element at index 3 = "+a);	
	a.add(12.5);
	System.out.println("Adding new element"+a);	
	a.remove(Double.valueOf(12.5));
	System.out.println("Deleted Element name kavya = "+a);	
	a.remove("Vatsala");
	System.out.println("Deleted Element name kavya = "+a);	
	

	}

}
