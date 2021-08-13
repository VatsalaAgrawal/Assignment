package com.techment.Day9.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("C:\\Users\\Administrator\\Desktop\\Techment File handling\\abc.txt");
		fw.write("hello \n");
		fw.write(92);
		fw.write(55);
		System.out.println("written Successfully");
		fw.close();
		

	}

}
