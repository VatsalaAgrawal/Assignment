package com.techment.Day12Java8;

class Parent{
	void phone()
	{
		System.out.println("mi");
	}
	}
public class AnonomysInnerClass {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.phone();
		
		//System.out.println("by using anonomys way-");
		Parent p2 = new Parent(){
		void phone() {
			System.out.println("samsung");
			}
		};
		p2.phone();
		
		
	}


}
