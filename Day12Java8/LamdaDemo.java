package com.techment.Day12Java8;

interface Bank1{
	void display();
}

public class LamdaDemo {

	public static void main(String[] args) {
	Bank1 b=()->System.out.println("This is Display Method");
	b.display();
	Bank1 b2=()->{
		System.out.println("This is Display Method");
		System.out.println("This is Multiple Method");
	};
	b2.display();

	}

}
