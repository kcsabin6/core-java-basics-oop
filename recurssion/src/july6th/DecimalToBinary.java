package july6th;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a number to calculate to binary ");
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();
		
		System.out.println(calculateBinary(num));

	}

	private static String calculateBinary(int num) {
		if(num==0) {return " ";}
		
		String result = calculateBinary(num/2)+num%2;
		return result;
		
	}

}
