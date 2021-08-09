package com.techment.day6.exception;
class LateException extends Exception
{

	public LateException(String message) {
		super(message);
		
	}
	
}

class Student1{
	void login(int time) throws LateException
	{
		if(time>9)
		{
throw new LateException("YOU ARE ABSENT");
		}
		else {
			System.out.println("YOU ARE PRESENT");
		}
	}
}


public class LateCustomException {

	public static void main(String[] args) throws LateException {
	Student1 s=new Student1();
	s.login(10);

	}
}
