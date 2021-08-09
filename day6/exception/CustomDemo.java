package com.techment.day6.exception;
class IdNotFoundException extends Exception{
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
}
class AgeException extends RuntimeException{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}

	
	}
	

public class CustomDemo {

	public static void main(String[] args) throws IdNotFoundException {
		throw new IdNotFoundException("EXCEPTION");
	}

}
