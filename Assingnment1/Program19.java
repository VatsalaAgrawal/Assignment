package com.techment.Assingnment1;

public class Program19 {

	public static void main(String[] args) {
		int i,j,k,l;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(k=1;k<=6-(i-1);k++)
			{
				System.out.print(k+" ");
			}
			for(l=5-(i-1);l>=1;l--)
			{
			
				System.out.print(l+" ");
			}
			System.out.println();
		}

		}



	}

