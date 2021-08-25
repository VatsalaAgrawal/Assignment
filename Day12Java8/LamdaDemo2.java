package com.techment.Day12Java8;

interface Calculation{
	//void add(int a,int b);
int add(int a,int b);
}

public class LamdaDemo2 {

	public static void main(String[] args) {
		//lamda expression with parameter
		//Calculation c=(a,b)->System.out .println("Result :"+(a+b));
		//c.add(2,4);
		//c.add(9,4);
		//c.add(2,42);
		
		
		//Single line body no need of return type
		Calculation c1=(a,b)->a+b;
		
		Calculation c2=(a,b)->
		{
			if(a>b)
				return a;
			return b;
						
		};
		
		System.out.println(c1.add(2, 8));
		System.out.println("Largest of two  :"+c2.add(5, 10));

	}

}
