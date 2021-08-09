package com.techment.demo;
class Bank1

{
	public void rateOfInterest(){
		System.out.println("3%");
		
	}
	public void openAccount(){
		System.out.println("Above 18 years");
		
	}
}
class SBI extends Bank1{
	public void rateOfInterest(){
		System.out.println("7%");
		
	}
	public void Loan(){
		System.out.println("you can apply for loan");
		
	}
}
class Axis extends Bank1{
	public void rateOfInterest(){
		System.out.println("9%");
		
	}
}

public class RuntimePolymorphism1 {

	public static void main(String[] args) {
		Bank1 b=new SBI();
		b.rateOfInterest();
		b.openAccount();

	}

	}

