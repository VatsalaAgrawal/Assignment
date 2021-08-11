package com.techment.Test1;

class Animal

{
	public void shout(){
		System.out.println("Sounds");
		
	}
	
}
class Dog extends Animal{
	public void shout(){
		System.out.println("bark");
	}
}
class Horse extends Animal{
	public void shout(){
		System.out.println("neigh");
		
	}
}
class Cat extends Animal{
		public void shout(){
			System.out.println("Meow");
			
		}
}

public class Program4 {

	public static void main(String[] args) {
		Animal a=new Horse();
	a.shout();
	}

}
