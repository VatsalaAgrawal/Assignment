package com.techment.Day7.ArrayListDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s1=new Stack();
				s1.push(1);
		s1.add(2);
		s1.add(3);
		System.out.println("Top Element"+s1.peek());
		s1.pop();
		System.out.println("Element"+s1);
		System.out.println("Top Element"+s1.peek());
		

	}

}
