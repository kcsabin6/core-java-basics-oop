package oops.core.java;

import java.util.Scanner;

public class MyFactorial {

	public static void main(String[] args) {
		System.out.println("Enter the number you want the Factorial of : ");
		Scanner scanner= new Scanner(System.in);
		int x= scanner.nextInt();
		MyFactorial fakt= new MyFactorial();
		fakt.calculateFactorial(x);		//calling non static method
		calculateFactorial2(x);
		scanner.close();
	}

	void calculateFactorial(int x) {
		int y=x;
		int fact=1;
		while(x>=1) {
			fact=fact*x;
			x--;
		}
		
		System.out.println("The Factorial of the given number "+y+" is "+fact+" //nonstatic method" );
		
	}
	
	
	
	static void calculateFactorial2(int x) {
		int y=x;
		int fact=1;
		while(x>=1) {
			fact=fact*x;
			x--;
		}
		
		System.out.println("The Factorial of the given number "+y+" is "+fact+" //static method" );
		
		
	}

}