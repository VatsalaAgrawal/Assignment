package com.techment.day6.exception1;

public class CustomException {

	public static void main(String[] args) {
	Amount a=new Amount();
	try {
		System.out.println(a.withdraw(2500));
	}
	catch(InsufficientFundException e)
	{
		System.out.println(e.getMessage());
	}
	}

}
