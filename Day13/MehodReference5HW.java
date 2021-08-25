package com.techment.Day13;
interface LargeNumber{
	int largest(int a,int b,int c);
}
class Calculationutil2{
	int findLargest(int a,int b,int c)
	{
		if(a>b&&a>c)
		return a;  
		else if(b>a&&b>c)
			return b ;
			else
				return c;
		
	}
}

public class MehodReference5HW {

	public static void main(String[] args) {
		LargeNumber largeNumber=(a,b,c)->{
			if(a>b&&a>c)
				return a;  
				else if(b>a&&b>c)
					return b ;
					else
						return c;
			
		};
		System.out.println("Lamda Output :"+largeNumber.largest(44,99,22));
		
		Calculationutil2 calculationutil2=new Calculationutil2();
		LargeNumber l=calculationutil2::findLargest;
		System.out.println("Through Method Reference :"+l.largest(33,77,11));
		

	}

}
