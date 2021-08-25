package com.techment.Day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatter2 {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		DateTimeFormatter f=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter l=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter m=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter s=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println(today.format(f));
		System.out.println(today.format(l));
		System.out.println(today.format(m));
		System.out.println(today.format(s));
		LocalDateTime todatdateTime=LocalDateTime.now();
		System.out.println("today date time"+todatdateTime);
		DateTimeFormatter f1=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	System.out.println(todatdateTime.format(s));
	
	ZonedDateTime date=ZonedDateTime.now();
	System.out.println(date);
	System.out.println(date.format(l));
		

	}

}
