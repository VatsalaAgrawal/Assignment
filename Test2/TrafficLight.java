package com.techment.Test2;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter light");
		String light=scanner.next();
		switch(light) {
		case "red":
		{
			System.out.println("stop");
			break;
		}
		case "yellow":
		{
			System.out.println("ready");
			break;
		}
		case "green":
		{
			System.out.println("go");
			break;
		}
		default:
		{
			break;
		}
		}
		
	}

}
