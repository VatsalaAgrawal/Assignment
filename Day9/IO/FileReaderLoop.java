package com.techment.Day9.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLoop {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\Techment File handling\\abc.txt");
		int ch=fr.read();
		while(ch!=-1)
		{
			System.out.println((char)ch);
			ch=fr.read(); //increment
		}

	}

}
