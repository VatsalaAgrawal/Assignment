package com.techment.Day7.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	System.out.println(a);
	System.out.println("Forward direction");
	ListIterator<Integer> i=a.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("Backward direction");
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
	
	}

	}
