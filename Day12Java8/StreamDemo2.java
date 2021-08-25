package com.techment.Day12Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			a.add(i);
		}
		System.out.println("numbers"+a);
		System.out.println("Print only even numbers-");
		a.stream().filter(num->num%2==0).forEach(s->System.out.println(s));
	//List<Integer> n=Arrays.asList(11,3,4);
		System.out.println("By using map-");
		a.stream().map(num->"after adding 100 :"+(num+100)).forEach(s->System.out.println(s));
		a.stream().limit(2).forEach(s->System.out.println(s));
	}

}
