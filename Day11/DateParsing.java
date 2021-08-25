package com.techment.Day11;

import java.time.LocalDate;



public class DateParsing {

	public static void main(String[] args) {
		 //String dob="23/06/1998";
		 
		 String joiningdate="2020-02-22";
		 //System.out.println("date of birth :"+dob);
		 //System.out.println("date of birth :"+joiningdate);
		 /* Parse for joining date*/
		 
		 LocalDate joiningDateAfterParse=LocalDate.parse(joiningdate);
		 System.out.println(joiningDateAfterParse);
		 
		 System.out.println( joiningDateAfterParse.getYear());
		 System.out.println( joiningDateAfterParse.getMonth());
		 
		 System.out.println("===============SAMPLE=======================");
		 
		 LocalDate today=LocalDate.now();
		 LocalDate joiningDate=LocalDate.parse(joiningdate);
		 
		 LocalDate birthDate=LocalDate.of(2020, 2, 22);
		 System.out.println(birthDate);
		 
	}

}
