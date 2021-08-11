package com.techment.Day8.Collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> h=new TreeMap<Integer,String>();
		h.put(1,"Anjana");
		h.put(2,"Pallavi");
		h.put(3,"Roshni");
		h.put(4,"Rahul");
		System.out.println("Elements are"+h);
		for(Entry<Integer,String> e:h.entrySet())
		{
			System.out.println(e);
			System.out.println("Key = "+e.getKey());
			System.out.println("Value = "+e.getValue());
			
			
		}

	}

}
