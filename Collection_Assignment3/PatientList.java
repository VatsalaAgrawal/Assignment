package com.techment.Collection_Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


class Patient implements Comparable<Patient>{
	private int PatientId;
	private String Name;
	private int Age;
	
	
	public Patient(int patientId, String name, int age) {
		super();
		setPatientId(patientId);
		setName(name);
		setAge(age);
	}
	public int getPatientId() {
		return PatientId;
	}
	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public int compareTo1(Patient o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override 
	 	public int compareTo(Patient o) { 
	 		if(Age>o.Age) 
	 			return 1; 
			else if(o.getAge()==Age) 
 		return 0; 
	 		else 
	 		return -1; 
	 	}
	@Override
	public String toString() {
		return "Patient [PatientId=" + PatientId + ", Name=" + Name + ", Age=" + Age + "]";
	} 
	

	
	
	
}
class NameSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
	return o1.getName().compareTo(o2.getName());
	
	}
}
class AgeSorting implements Comparator<Patient> 
{
 
	@Override 
 	public int compare(Patient o1, Patient o2) { 
 		if(o1.getAge()>o2.getAge()) 
 			return 1; 
 		else if(o1.getAge()>o2.getAge()) 
		return 0; 
 		else 
 			return -1; 
 	} 
 	 
 } 


public class PatientList {

	public static void main(String[] args) {
		ArrayList<Patient> p=new ArrayList<Patient>();
		p.add(new Patient(12,"Ridhima",66));
		p.add(new Patient(11,"Mamta",80));
		p.add(new Patient(14,"Koshik",44));
		System.out.println("After NAME SORTING-");
		Collections.sort(p,new NameSorting());
		for(Patient e:p)
		{
			System.out.println(e.getPatientId()+" "+e.getName()+" "+e.getAge());
			
		}
		System.out.println("After AGE SORTING-");
		Collections.sort(p,new AgeSorting());
		for(Patient e:p)
		{
			System.out.println(e.getPatientId()+" "+e.getName()+" "+e.getAge());
			
		}
		System.out.println("Display in TreeSet-");
		TreeSet<Patient>ts=new TreeSet<Patient>(p); 
		 		for(Patient patient :ts) 
		 			System.out.println(patient); 
		 		Scanner scanner = new Scanner(System.in); 
		 		System.out.println("Enter The Name Want to find the Age : "); 
				String name = scanner.next(); 
		 		getPatientAge(name, ts); 
		 
		} 
		 	 
		 	public static void getPatientAge(String name, TreeSet<Patient> set) 
		 	{ 
		 		for(Patient p :set) 
		 			if(p.getName().matches(name)) 
		 				System.out.println("The Age of "+name + " is : "+p.getAge()); 
		 			 
		 	}
		 	}

