package com.techment.Day8.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();
		h.put(1,"Anjana");
		h.put(2,"Rahul");
		h.put(3,"Roshni");
		h.put(4,"Pallavi");
		System.out.println("Elements are"+h);
		for(Entry<Integer,String> e:h.entrySet())
		{
			System.out.println(e);
			System.out.println("Key = "+e.getKey());
			System.out.println("Value = "+e.getValue());
			
			
		}
	}

}
