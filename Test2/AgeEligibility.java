package com.techment.Test2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;



public class AgeEligibility {
	

	public static void main(String[] args) {
		AgeEligibility age=new AgeEligibility();
		System.out.println(age.votersList());
	}
	
	public List<String> votersList() {

		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(23,"12");
		h.put(43,"vatsala");
		h.put(10,"17");
		h.put(8,"11");
		h.put(7,"10");
		h.put(17,"9");
		List<String> list=new ArrayList<String>();
	         for(Entry<Integer, String> entry:h.entrySet())
	         {
	        	 if(entry.getKey()>18)
	        	 {
	        		 list.add(entry.getValue());
	        	 }
	        	
         }
         return list;
     }
				}
				
				
	
