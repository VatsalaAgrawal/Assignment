package com.techment.Day10.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class MySqlConnectionDemo {

	public static void main(String[] args) {
	try {
		//Step1-Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class is found");

		//Step2-Create the connection
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/techment?autoReconnect=true&useSSL=false","root","Vatsala12345*");
	System.out.println("Connected");
	
	//Step3-Create Statement
	Statement stmt=con.createStatement();
	//stmt.execute("insert into employee values(3,'Kumar',34000);");
	//System.out.println("Inserted");
	ResultSet rs=stmt.executeQuery("select * from employee");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}

}
