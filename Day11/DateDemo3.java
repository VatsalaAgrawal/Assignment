package com.techment.Day11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo3 {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today.getDayOfWeek());
		//System.out.println(today.plusYears(2).getDayOfWeek().toString().equals("WEDNESDAY"));
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		

	}

}
