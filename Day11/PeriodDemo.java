package com.techment.Day11;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	LocalDate birthdate=LocalDate.of(1989, 11, 30);
	Period p=Period.between(birthdate,today);
	System.out.println(p.getYears()+" YEARS"+p.getMonths()+"months"+p.getDays()+"days");
	
	System.out.println(birthdate.isBefore(today));

	}

}
