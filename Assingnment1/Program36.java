package com.techment.Assingnment1;

import java.util.Scanner;

public class Program36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,l;
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
	
				System.out.print(j);
			}
			
						for(l=n-i;l>=1;l--)
				{
					System.out.print(l);
				}
				
				System.out.println();
					
			}
				
		}

	}
