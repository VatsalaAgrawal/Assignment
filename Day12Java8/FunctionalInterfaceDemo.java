package com.techment.Day12Java8;
@FunctionalInterface 
interface bank2{
	void rateOfInterest() ;
	default void DisplayMode() {
		System.out.println("This is default method");
	}
	static void loan() {
		System.out.println("You can Apply for loan");
	}

	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
