package com.techment.Day13;
interface Calculation{
	void display();
}
class Hello{
	void message() {
		System.out.println("Today is Holiday");
	}
}

public class MethodReference1 {

	public static void main(String[] args) {
		Calculation calculation=()->System.out.println("Today is holiday");
		Hello h=new Hello();
		Calculation calculation2=h::message;
		calculation2.display();

	}

}
