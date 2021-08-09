package com.techment.demo1;
class Employee{
	int id;
	String name;
	Address address; //object reference
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo() {
		System.out.println("id = " +id);
		System.out.println("name = " +name);
		System.out.println("doorNo = "+address.doorNo);
		System.out.println("city = " +address.city);
		System.out.println("pincode = " +address.pincode);
	}
	
}
class Address{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	public Address(int doorNo, String streetName, String city, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	
	
}
public class HasARelationship {

	public static void main(String[] args) {
		Address addr=new Address(101,"raguh","Bangalore",778866);
		Employee emp=new Employee(101,"vatsala",addr);
	emp.displayEmployeeInfo();
			}

}
