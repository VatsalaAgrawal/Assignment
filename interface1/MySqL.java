package com.techment.interface1;

public class MySqL implements JdbcConnection {

	@Override
	public void connect() {
		System.out.println("CONNECT TO MYSQL");

	}

}
