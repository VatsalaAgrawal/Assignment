package com.techment.Day7.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	System.out.println(a);
	Iterator<Integer> i=a.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	}
	

}
