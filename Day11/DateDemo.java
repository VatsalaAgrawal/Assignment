package com.techment.Day11;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		LocalDate birthDate=LocalDate.of(1998, 6, 23);
		System.out.println(birthDate);
		System.out.println(date.isAfter(birthDate));
	
		
		

	}

}
