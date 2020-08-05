package oops.core.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWriteLineByLine {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file you want to read:");
		String fileName = scanner.next();
		File file = new File(fileName);
		//FileNotFound Exceptions is example of checked exceptions
		
		FileReader fileReader = new FileReader(file);
		FileWriter fileWriter = new FileWriter("G:/Kabu.txt");
	
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		String line;
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
			bufferedWriter.write(line + System.lineSeparator());
			Thread.sleep(400);
		}
bufferedReader.close();
bufferedWriter.close();
fileReader.close();
fileWriter.close();
scanner.close();
	}

}
