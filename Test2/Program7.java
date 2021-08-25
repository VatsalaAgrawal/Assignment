package com.techment.Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		while(true)
		{
			int s=scanner.nextInt();
			if(s==-1)
			{
				break;
			}
			else
			{
				l.add(s);
			}
		}
		int size=l.size();
		if(size%2==0) {
		for(int i=0;i<size/2;i++)
		{
			l1.add(l.get(i));
		}
		for(int i=size/2;i<size;i++)
		{
			l2.add(l.get(i));
		}
		}
		else {
			for(int i=0;i<=size/2;i++)
			{
				l1.add(l.get(i));
			}
			for(int i=size/2+1;i<size;i++)
			{
				l2.add(l.get(i));
			}
		}
			
System.out.println(l1);
System.out.println(l2);

	}

}
