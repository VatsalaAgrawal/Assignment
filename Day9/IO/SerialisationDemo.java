package com.techment.Day9.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee2 implements Serializable
{
int id;
String name;
public Employee2(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}

public class SerialisationDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("=======Serialisation Start=========");
		Employee2 e=new Employee2(1,"Sachin");
		FileOutputStream fos=new FileOutputStream("hello.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("=======Serialisation End=======");
		

	}

}
