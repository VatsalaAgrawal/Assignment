package com.techment.Day9.IO;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		File  file = new File ("C:\\Users\\Administrator\\Desktop\\Techment File handling\\abc");
		System.out.println(file.exists());
		//file.createNewFile();
		file.mkdir();
		System.out.println(file.exists());
		
		

	}

}
