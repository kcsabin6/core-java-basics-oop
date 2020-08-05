package oops.core.java;

import java.util.Scanner;

public class Factorial {
	  public static void main(String[] args) {
	        // CTrl+shift+/ for comment
	       /* 
	         * int fact=1; int x=4; for(int i=1;i<=x;i++){ fact= fact*i;
	         * 
	         * } System.out.println("The factorial of given no is "+fact);
	         
	        
	         * System.out.println("Enter the no you want to calculate factorial..");
	         * Scanner scanner=new Scanner(System.in); int x=scanner.nextInt(); int
	         * fact=1; for(int i=1;i<=x;i++){ fact= fact*i;
	         * 
	         * } System.out.println("The factorial of given no is "+fact);*/

		System.out.println("Enter the no you want to calculate factorial..");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Factorial fact = new Factorial();
        fact.calculateFactorial(x); // calling non-static method..calculateFactorial(int x) (needs object to call non-static method)
                                   
        
        calculateFactorial2(x); // calling static method(can be called directly)
        scanner.close();
    }
void calculateFactorial(int x) { // method definition
        int fact = 1;
        while( x>=1) {
        	fact=fact*x;
        	x=x-1;
        	
        }
       /* for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }*/
        System.out.println("The factorial of given no is " + fact);
    }

    static void calculateFactorial2(int x) { // method definition
        int fact = 1;
        while( x>=1) {
        	fact=fact*x;
        	x=x-1;
        	
        }
        /*for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }*/
        System.out.println("The factorial of given no is " + fact);
    }

}

