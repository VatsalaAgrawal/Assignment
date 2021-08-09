package com.techment.day6.exception1;

public class Amount {
int balance=5000;
String withdraw(int amount)
{
	if(amount>balance)
	{
	throw new InsufficientFundException("Insufficient Fund");
	}
	else
		return "you have withdraw"+amount+"amount";
}


}
