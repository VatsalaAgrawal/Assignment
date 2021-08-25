package com.techment.Day12Java8;
interface Calculation1{
	String largest(int a,int b,int c) ;
}

public class LamdaDemo3HW {
	
	public static void main(String[] args) {
		Calculation1 l=(a,b,c)->
		{
			if(a>b&&a>c)
				return a+" is largest";
			else if(b>a&&b>c)
			return b+" is largest";
			return c+" is largest";
						
		};
		System.out.println(l.largest(3, 8, 4));

	}

}
