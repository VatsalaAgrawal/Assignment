package com.techment.Day12Java8;

import java.util.function.Function;
import java.util.function.Predicate;



public class PredicateDemo {

	public static void main(String[] args) {
	Predicate<Integer> p=(num)->num>18;
	System.out.println(p.test(20));
	Predicate<String> sp=(name)->name.contains("b");
	System.out.println(sp.test("Vatsala"));

	
	Function<Integer,Integer> f1=(num1)->num1;
	
	Function<Integer,String> f2=(num1)->"Value of num :"+num1;
	Function<String,Integer> f3=(name)->name.length();
	System.out.println(f1.apply(2));
	System.out.println(f2.apply(4));
	System.out.println(f3.apply("Vatsala"));
	
	
	
	}

}
