package oops.core.java;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int[] ab = new int[2];
		System.out.println("Please input the size of the array you want to insert(int value): ");
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int[] Array1 = new int[len];
		
		System.out.println("Please input the array sequentially(int value): ");
		for (int i=0; i<len; i++ ) {
			Array1[i]=scanner.nextInt();
		}
		System.out.println("The array is: "+Arrays.toString(Array1));
		Swap s1= new Swap();
	//	Reverse r1= new Reverse();
		if(len%2==0) {
			for(int i=0;i<=((len/2)-1);i++) {
				for(int j=len-1;j>=(len/2);j--) {
					//System.out.println(s1.method(Array1[i],Array1[j]));
				s1.method(Array1[i],Array1[j]);
				//	Array1[i]=ab[0];
				//	Array1[j]=ab[1];
				}	
			}
		}
		else {
			for(int i=0;i<=(((len-1)/2)-1);i++) {
				for(int j=(len-1);j>=((len+1)/2);j--) {
					System.out.println(s1.method(Array1[i],Array1[j]));
				}	
			}
		}
		System.out.println(Arrays.toString(Array1));
		//r1.reverse(Array1);
		scanner.close();
	}

}
