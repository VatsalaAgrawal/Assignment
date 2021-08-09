package com.techment.demo;

class Color{  
void color(){
	System.out.println("COLOR");
	}  
}  
class Red extends Color{  
void red(){
	System.out.println("RED");
	}  
}  
class Yellow extends Color{  
void yellow(){
	System.out.println("YELLOW");
}  
}  

public class HieraricalInheritance {
	public static void main(String args[])
	{
		Yellow y=new Yellow();
		y.yellow();
		y.color();
			}

}
