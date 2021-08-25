package com.techment.Test2;

class AgeException extends Exception{
	String msg;

	public AgeException(String msg) {
		super(msg);
		this.msg = msg;
	}


	
	}
class SizeException extends Exception{
	String msg;

	public SizeException(String msg) {
		super(msg);
		this.msg = msg;
		
	}

	}


class Person{
	private int id;
	private String name;
	private int age;
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Age(age,name);
	}
	public void Age(int age,String name){
		try {
			if(age<15) {
				throw new AgeException("Age is not Valid");
			}
			else if(name.length()<4)
				throw new SizeException("Length of Name is not correct");

			else 
				System.out.println("ID :+"+id);
			System.out.println("NAME :+"+name);
			System.out.println("AGE :+"+age);
			}
			catch(AgeException e)
			{
				System.out.println("Age of the person should be above 15");
			}
			catch(SizeException e)
			{
				System.out.println("Name should be minimum 3 characters");
			}

		}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		Person person=new Person(11, "ab", 10);
		//person.Age(15, "ab");

	}


}
