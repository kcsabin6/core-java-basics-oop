package july7th;

public class GcdHcf {

	public static void main(String[] args) {
		
		int num1=21;
		int num2=7;
		int Hcf=calculateHcf(num1,num2);
		System.out.println("HCF is "+Hcf);	

	}

	
	
	
	
	private static int calculateHcf(int num1, int num2) {
		int hcf=0;
		if(num1<num2)
		{
			for(int i=1; i<=num1; i++) {
				if(num1%i ==0 && num2%i ==0) { hcf=i;}
			}
		}
		
		else {
			for(int i=1; i<=num2; i++) {
				if(num1%i ==0 && num2%i ==0) { hcf=i;}
			}
			}
		return hcf;
		
	}
	

	
}
