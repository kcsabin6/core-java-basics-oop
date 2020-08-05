package july6th;

public class PrintOneToHundread {

	public static void main(String[] args) {
		
		System.out.println("Ascending");
		callFunction(100);
		System.out.println("Descending");
		callFunctionRev(100);

	}

	private static int callFunction(int i) {
		if(i==0) {return 1;}
		callFunction(i-1);
		System.out.println(i);
		return i;
		
	}
	
	private static int callFunctionRev(int i) {
		if(i==0) {return 1;}
		System.out.println(i);
		callFunctionRev(i-1);
		
		return i;
		
	}

}
