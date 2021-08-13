package com.techment.Day10.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
	Connection con=ConnectionDetails.getConnected();
	PreparedStatement ps=con.prepareStatement("select * from employee");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
	
	
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
