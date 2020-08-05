package oops.core.java;

public class Match {
	public static void main(String... main) {
		int result= main(45);
		System.out.println("result= "+result);
		//return -90;
	}
		
		public static int main(int x) {
			try {
				x=x+55;
				if(x==100) {
					System.out.println("x1 = "+x);
					return x;
					
				}
				x=x+12;
				System.out.println("x2 = "+x);
			}
			finally {x=x+20;}
	//	}
		System.out.println("x3 = "+x);
		return 100;
	}

}