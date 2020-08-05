package july7th;

public class GcdHcf1 {

	public static void main(String[] args) {
		
		int num1=49;
		int num2=35;
		int Hcf=calculateHcf(num1,num2);
		System.out.println("HCF is "+Hcf);	

	}

	
	
	
	
	private static int calculateHcf(int num1, int num2) {
		int hcf=0;
		if(num1<num2)
		{
			for(int i=num1; i>=1; i--) {
				if(num1%i ==0 && num2%i ==0) { hcf=i; break;}
			}
		}
		
		else {
			for(int i=num2; i>=1; i--) {
				if(num1%i ==0 && num2%i ==0) { hcf=i; break;}
			}
			}
		return hcf;
		
	}
	

	
}
