package com.techment.Collection_Assignment3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class ScoreCard {

	public static void main(String[] args) {
		int sum=0;
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("Rahane", 20);
		h.put("Rahul", 30);
		h.put("Kohli", 150);
		h.put("Dhoni", 50);
		h.put("Lokesh", 2);
		System.out.println("Players who battled-");
		for(Entry<String,Integer> e:h.entrySet())
		{
			System.out.println(e.getKey());
		}
		System.out.println("Scores by Players-");
		for(Entry<String,Integer> e:h.entrySet())
		{
			System.out.print(e.getKey()+" : ");

			System.out.println(e.getValue());
		}
		for(Entry<String,Integer> e:h.entrySet())
		{
			Integer value=(Integer)e.getValue();
			sum +=value;
		}
		System.out.println("Total Score : "+sum);
		int maxValueInMap=(Collections.max(h.values()));
		for(Entry<String,Integer> e:h.entrySet())
		{
			if(e.getValue()==maxValueInMap)
			{
				System.out.println("Name of Highest Scorer : "+e.getKey());
			}
		}
		System.out.println("Run  Scored by Dhoni : "+h.get("Dhoni"));
		
	}
	
}
