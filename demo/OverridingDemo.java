package com.techment.demo;
class Bank{
	public void rateOfInterest(){
		System.out.println("8%");
	}
	}
class SBI1 extends Bank{
	public void rateOfInterest(){
		System.out.println("7%");
		
	}
	
}
class Axis1 extends Bank{
	public void rateOfInterest(){
		System.out.println("9%");
		
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		SBI1 b=new SBI1();
		b.rateOfInterest();
	

	}

}
