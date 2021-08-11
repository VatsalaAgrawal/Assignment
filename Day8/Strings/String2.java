package com.techment.Day8.Strings;

public class String2 {

	public static void main(String[] args) {
	String courseName="Java";
	System.out.println(courseName);
	courseName.concat("Programming");
	System.out.println("After concat= "+courseName);
	
	courseName=courseName.concat(" Programming");
	System.out.println("After Assigning= "+courseName);

}
}
