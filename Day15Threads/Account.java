package com.techment.Day15Threads;

public class Account {
	int balance=0;
	synchronized public int withdraw(int amount)
	{

		if(amount>balance) {
			try
			{
				System.out.println("No balance waiting for deposit....");
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() +" is going to withdraw");
		balance -=amount; //balance=balance-amount
		return balance;

	}
	synchronized public int deposit(int amount)
	{
		System.out.println(Thread.currentThread().getName()+" is Going to Deposit");
		balance+=amount;
		notify();
		return balance;
	}

}
