package oops.core.java;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		System.out.println("Enter an integer number : ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
	CreateTable.table(x);
	System.out.println("The table has been created");
		
		
	}
	

}
