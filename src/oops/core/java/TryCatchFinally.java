package oops.core.java;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		/*int[] muNum= {1,2,3,4,5};
		System.out.println(muNum[5]);*/
		/*try {
			int[] muNum= {1,2,3,4,5};
			System.out.println(muNum[100]);
		}
		catch(Exception e){
			System.out.println("Someting went wrong!!!");
		}*/
		try {
			int[] muNum= {1,2,3,4,5};
			System.out.println(muNum[5]);
		}
		catch(Exception e){
			e.printStackTrace();
			//System.out.println("Something went wrong!!!");
		}
		finally {
			System.out.println("Try and catch statement has been executed.");
		}
		
	}

}
