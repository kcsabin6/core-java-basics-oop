package oops.core.java;

public class ArthmiticException {
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied : You are under age!!!");
		}
		else {
			System.out.println("Access granted : You are old enough.");
		}
	}
public static void main(String[] args) {
	checkAge(18);
}
}
