package oops.core.java;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("Enter the parameters you want to enter (2 or 3)");
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		
		
		Employee emp1 = new Employee();
		
		if(x==2) {
			System.out.println("Entered name");
			Scanner scanner21 = new Scanner(System.in);
			String name=scanner21.nextLine();
			
			
			System.out.println("Entered age");
			Scanner scanner22 = new Scanner(System.in);
			int age = scanner22.nextInt();
			
			
		Employee emp2 = new Employee(name,age);
		System.out.println(emp2);
		
		}
		
		
		else if(x==3) {
			System.out.println("Entered name");
			Scanner scanner31 = new Scanner(System.in);
			String name=scanner31.nextLine();
			
			
			System.out.println("Entered age");
			Scanner scanner32 = new Scanner(System.in);
			int age = scanner32.nextInt();
			
			
			System.out.println("Entered salary");
			Scanner scanner33 = new Scanner(System.in);
			float salary = scanner33.nextFloat();
			
			
		Employee emp3 = new Employee(name,age,salary);
		System.out.println(emp3);
		
		}
		
		
		else {
			System.out.println("Entered the parameters should be 2 or 3 !!!");
			//scanner.close();
		}

	}

}
