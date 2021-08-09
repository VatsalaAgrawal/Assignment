package com.techment.day6.exception;

import java.io.FileNotFoundException;

class Student{
	void checkEligibility(int age) 
	{
		if(age>=18)
		{
			System.out.println("You can apply for loan");
		}
		else
		{
			throw new ArithmeticException("You cannot apply for loan");
		}
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		Student student=new Student();
		student.checkEligibility(10);                                     
		
	}

}
