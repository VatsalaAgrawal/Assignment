package com.techment.demo;

public class Customer {
	int id,minBalance;
	String name;
	long contact;
	Customer(int id,String name,long contact,int minBalance)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.minBalance=minBalance;
	}
	public void display() {
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Contact :"+contact);
		System.out.println("minBalance :"+minBalance);
	}
	public void accountType()
	{
		if(minBalance==0)
		{
			System.out.println("Zero Balance Account");
		}
		else if(minBalance==1000)
		{
			System.out.println("Saving Balance Account");
		}
		else if(minBalance==10000)
		{
			System.out.println("Current Balance Account");
		}
			
	}
public static void main(String args[])
{
Customer customer1=new Customer(101,"Riddhima",9899776655l,1000);
Customer customer2=new Customer(102,"Ruhaan",985676655l,10000);
Customer customer3=new Customer(103,"Ridz",9039776655l,0);
customer1.display();
customer1.accountType();
customer2.display();
customer2.accountType();
customer3.display();
customer3.accountType();


}
}
