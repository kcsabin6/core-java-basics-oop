package july7th;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the count (n) : ");
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		int f0=0;
		int f1=1;
		
		int res=goFibonacci(n);
		System.out.println("Using Iteration "+res);
		
		
		int res1=goFibonacciRec(f0,f1,n);
		System.out.println("Using recurrance "+res1);
			
	}

	
	
	
	
	
	private static int goFibonacciRec(int f0, int f1,int n) {
		
		if(n<=2) {return f1;}
	    return goFibonacciRec(f1,f0+f1,n-1);
			}






	private static int goFibonacci( int n) {
		//int res=0;
		int f0=0;
		int f1=1;
		int sum=0;
		
		for(int i=2; i<=n-1; i++) {
			// res=f0;	//f0 to result
			 sum=f0+f1;	//sum 
			 f0=f1;	   	//make f0 to f1
			 f1=sum;	//keep sum to f1 then loop with revised f0 and f1
			 
			 
		}
		return f1;
		
	}

	
	
	
}
