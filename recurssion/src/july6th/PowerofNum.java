package july6th;

import java.util.Scanner;

public class PowerofNum {

	public static void main(String[] args) {
		
	System.out.println("Enter the number to power to calulate (x) ");
	Scanner scan=new Scanner(System.in);
	int x= scan.nextInt();
	
	System.out.println("Enter the number of times to calculate (n) ");
	int n= scan.nextInt();
	
	System.out.println(calculatePower(x,n));
	
	
	
	

	}

	private static int calculatePower(int x, int n) {
		
		if(n==0) {return 1;}
		int Total=x * calculatePower(x,n-1);
		return Total;
	}

}
