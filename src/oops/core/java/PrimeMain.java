package oops.core.java;

import java.util.Scanner;

public class PrimeMain {
	public static void main(String[] args) {
		System.out.println("Enter an integer number to check : ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		boolean result = PrimeCalculate.calculate(x);
		
		if (result == true) {
		System.out.println("The given number " + x + " is not prime number.");
	}
	else {
		System.out.println("Given number " + x + " is prime number.");
	}
		
		
	}

}
