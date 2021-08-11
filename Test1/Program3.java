package com.techment.Test1;

import javax.naming.LinkException;

class Employee1
{
	private String firstName;
	private String lastName;
	

public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Validation(firstName,lastName);
}
public void Validation(String firstName,String lastName){
	try {
	if(firstName==null  && lastName==null) {
		throw new NullPointerException();
	}
	else if(firstName.length()<4||lastName.length()<4)
		throw new LinkException();

	else 
		System.out.println("First name="+firstName+"Last Name = "+lastName);
	}
	catch(NullPointerException e)
	{
		System.out.println("Entry Missing");
	}
	catch(LinkException e)
	{
		System.out.println("name should be minimum 3 characters");
	}

}
}

public class Program3 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(null,null);
		
				

	}

}

