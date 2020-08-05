package oops.core.java;

public class PrimeCalculate {
	// int x;
	//boolean flag = false;

//	PrimeCalculate() {}

	public static boolean calculate(int x) {
		//int y = x;
		for (int i = 2; i <= (x - 1); i++) {
			if (x % i == 0) {
				return  true;
			}
			
		}
			
		return false;
		}

	}


