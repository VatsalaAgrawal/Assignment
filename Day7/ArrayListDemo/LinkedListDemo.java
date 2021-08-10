package com.techment.Day7.ArrayListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.addFirst(100);
		System.out.println("Elements are - "+l);
		l.add(33);
		l.addLast(40);
		l.add(30);
		System.out.println("Elements after adding more  - "+l);
		
		l.remove();
		System.out.println("After removing Elements are - "+l);
		System.out.println("top element - "+l.peek());
		

	}

}
