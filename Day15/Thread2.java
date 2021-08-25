package com.techment.Day15;
class Apple extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Eat Apple "+Thread.currentThread().getName());
		}
		
	}
}
class Banana extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Eat Banana "+Thread.currentThread().getName());
		}
		
	}
}

public class Thread2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Apple a=new Apple();
		Banana b=new Banana();
		a.setName("Apple Thread");
		b.setName("Banana Thread");
		a.start();
		b.start();

	}

}
