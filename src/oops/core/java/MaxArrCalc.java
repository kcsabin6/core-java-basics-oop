package oops.core.java;

public class MaxArrCalc {

	public Integer maxcalc(int num[]) {

		int max = num[0];
		for (int i = 1; i < (num.length); i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}
}