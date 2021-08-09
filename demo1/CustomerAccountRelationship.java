package com.techment.demo1;
class Account{
	int accountNo;
	String accountType;
	int balance;
	String ifse;
	String branch;
	public Account(int accountNo, String accountType, int balance, String ifse, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifse = ifse;
		this.branch = branch;
	}
	
}
class Customer{
	int cusId;
	String cusName;
	Account account;
	public Customer(int cusId, String cusName, Account account) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.account = account;
	}
	void displayCustomerDetails()
	{
		System.out.println("Customer id ="+cusId);
		System.out.println("Customer Name ="+cusName);
		System.out.println("Customer Account No ="+account.accountNo);
		System.out.println("Customer Account Type ="+account.accountType);
		System.out.println("Customer Account Balance ="+account.balance);
		System.out.println("Customer IFSE Code ="+account.ifse);
		System.out.println("Customer Account Branch ="+account.branch);
		System.out.println();
	}
	
}

public class CustomerAccountRelationship {

	public static void main(String[] args) {
		Account a=new Account(12,"Current",1000,"HF208976","Smriti Nagar");
		Account a1=new Account(16,"Saving",10000,"HF208978","Smriti Nagar");
		Account a2=new Account(19,"Current",1555,"HF278976","Nehru Nagar");
		Customer c=new Customer(101,"Piyush",a2);
		Customer c1=new Customer(100,"Vishaka",a);
		Customer c2=new Customer(109,"Reshmi",a1);
		c.displayCustomerDetails();
		c1.displayCustomerDetails();
		c2.displayCustomerDetails();
		}

}
