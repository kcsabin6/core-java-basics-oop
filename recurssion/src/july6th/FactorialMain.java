package july6th;

import java.util.Scanner;

public class FactorialMain {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		
		System.out.println(calculateFactorial(x));
		
		
		
	}

	private static int calculateFactorial(int x) {
		if(x==0) return 1;
		int fact=x * calculateFactorial(x-1);
		return fact;
	
	}
	

}
