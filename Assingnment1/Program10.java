package com.techment.Assingnment1;

import java.util.Scanner;

public class Program10 {
	int i,j;
		public void isPrime()
	{
			Scanner scanner =new Scanner(System.in);
		boolean flag=false;
				System.out.println("Enter n");
		int n=scanner.nextInt();
		
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		int i,j,flag=0,sum=0;
		System.out.println("Enter num  ");
		int num=scanner.nextInt();
		for(i=1;i<=num;i++)
		{
			flag=0;
			for(j=1;j<=num;j++)
			{
				if(i%j==0)
				{
				flag++;
				}
			}
							if(flag==2)
				{
					System.out.print(i+",");
					sum=sum+i;
				}
			
			}
		System.out.println();
		System.out.println("sum="+sum);
					System.out.println();
		Program10 p=new Program10();
		p.isPrime();
	}

}

