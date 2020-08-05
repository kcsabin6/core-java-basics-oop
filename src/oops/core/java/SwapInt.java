package oops.core.java;

import java.util.Scanner;

public class SwapInt {

	public static void main(String[] args) {
		int[] ab = new int[2];
		System.out.println("Please input the 1st integer a=");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		System.out.println("Please input the 2nd integer b=");
		int b = scanner.nextInt();
		
		Swap s1= new Swap();
		System.out.println("now swapped values are a="+s1.method(a, b)+" b="+s1.method(b, a));
		scanner.close();
	}

}
