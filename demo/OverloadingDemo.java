package com.techment.demo;
class Hello1 {
	public void write(int num)
	{
		System.out.println(num);
	}
	public void write(String msg )
	{
		System.out.println(msg);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Hello1 h=new Hello1();
		h.write(3);
		h.write("Rahul");
		
	}

}
