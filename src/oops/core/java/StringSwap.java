package oops.core.java;

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
		System.out.println("Please input the 1st string s1:");
		Scanner scanner = new Scanner(System.in);
		String s1= scanner.nextLine();
		
		System.out.println("Please input the 2nd string s2:");
	
		String s2= scanner.nextLine();
		SSwap sw1 = new SSwap();
		System.out.println("The swapped integers are s1 = "+sw1.smethod(s1,s2));
		System.out.println("The swapped integers are s2 = "+sw1.smethod(s2,s1));
      scanner.close();

	}

}
