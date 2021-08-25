package com.techment.Day15Threads;

public class InterThreadCommunication {

	public static void main(String[] args) {
		Account account=new Account();
		Thread t1=new Thread() {
			public void run()
			{
				System.out.println("Final balance left is :"+account.withdraw(2000));
			}
		};
		Thread t2=new Thread() {
			public void run()
			{
				System.out.println("Final balance left is :"+account.deposit(3000));
			}
		};
		t1.start();
		t2.start();
	

}
}
