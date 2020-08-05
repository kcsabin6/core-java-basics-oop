package july7th;

public class GcdRecursion {

	public static void main(String[] args) {
		
		int a=99;
		int b=30;
		int Hcf=calculateRecHcf(a,b);
		System.out.println("HCF is "+Hcf);
		
		
		}

	private static int calculateRecHcf(int a, int b) {
	if(b==0) {return a;}
	return calculateRecHcf(b,a%b);
	

		
	}

}
