package com.techment.Day11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
LocalDate today=LocalDate.now();
DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy MM dd");
DateTimeFormatter d1=DateTimeFormatter.ofPattern("yyyy MMM dd");
DateTimeFormatter d2=DateTimeFormatter.ofPattern("yyyy/MM/dd E");
DateTimeFormatter d3=DateTimeFormatter.ofPattern("MMM dd");
DateTimeFormatter d4=DateTimeFormatter.ofPattern(" MMM dd E");
DateTimeFormatter d5=DateTimeFormatter.ofPattern("MMM dd EEEE");

System.out.println(today.format(d));

System.out.println(today.format(d1));
System.out.println(today.format(d2));
System.out.println(today.format(d3));
System.out.println(today.format(d4));
System.out.println(today.format(d5));
	}

}
