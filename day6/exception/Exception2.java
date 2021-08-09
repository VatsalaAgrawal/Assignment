package com.techment.day6.exception;

public class Exception2 {

	public static void main(String[] args) {
		int []a=new int[5];
		System.out.println("Vatsala Agrawal");
		System.out.println("Vatsala");
		try {
			System.out.println(1/0);
		System.out.println(a[7]=12);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			System.out.println("contact 9089776655");


			}


	}


