package com.techment.interface1;

public class Oracle implements JdbcConnection {

	@Override
	public void connect() {
		{
			System.out.println("CONNECT TO ORACLE");
		}

	}

}
