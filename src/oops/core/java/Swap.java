package oops.core.java;

public class Swap {
	//public static String[] ab;

	//int[] ab = new int[2];
	public int[] method(int a,int b) { //for simple integer replace int[]-->Integer
		int[] ab = new int[2];
		a=b-a;	//difference value is stored at a
		b=b-a;	//value of a is stored at b
		a=b+a;	//value of b(original a) and difference(a) is added to get original b 
		ab[0]=a;
		ab[1]=b;
		System.out.println(ab[0]);
		System.out.println(ab[1]);
		
		return ab; //for simple integer replace with return a;
		
	
	}
}
