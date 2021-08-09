package com.techment.day6.exception;

import java.io.FileNotFoundException;
class Employee{

 void checkEligibility(int age) throws FileNotFoundException
{
	if(age>=18)
	{
		System.out.println("You can apply for loan");
	}
	else
	{
		throw new FileNotFoundException("You cannot apply for loan");
	}
}
}


public class ThrowsDemo {

	public static void main(String[] args)  throws FileNotFoundException {
		Employee student=new Employee();
		student.checkEligibility(17);                                     
		

	}

}
