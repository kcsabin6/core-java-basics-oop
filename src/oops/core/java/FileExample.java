package oops.core.java;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileExample {
	public static void main(String[] args) throws Exception {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the name of the file");
	String fileName = scanner.next();
	File file = new File(fileName);
	//System.out.println(file.isFile());
	//FileNotFound Exception is the Example of checked exception
	FileReader filereader = new FileReader(file);
	int ch=0;
	while((ch=filereader.read())!=-1) {
	System.out.println((char)ch);	
	Thread.sleep(300);
	}
	scanner.close();
	filereader.close();
	}

}
