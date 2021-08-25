package com.techment.Day12Java8;

import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(1);
	a.add(10);
	a.add(89);
	System.out.println(a);
	a.stream().forEach(i->System.out.println(i));
	
	//Method reference
	a.stream().forEach(System.out::println);

	}

}
