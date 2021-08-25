package com.techment.Day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<Integer>();
		n.add(1);
		n.add(10);
		n.add(13);
		n.add(11);
		n.add(100);
System.out.println(n);
n.forEach(s->System.out.println(s));
n.forEach(System.out::println);
System.out.println("After Sorting");
n.stream().sorted().forEach(System.out::println);
List<Integer> mySorted=n.stream().sorted().collect(Collectors.toList());

System.out.println(mySorted);
List<Integer> myRev=n.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(myRev);
	
	
	}

}
