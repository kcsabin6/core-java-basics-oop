package oops.core.java;

public class SSwap {
	public String smethod(String s1,String s2) {
		s1=s1+s2;
		s2=s1.substring(0,(s1.length())-(s2.length()));
		s1= s1.substring((s2.length()), s1.length());	
		
		return s1;
		
		//System.out.println("now swapped value is  s1 = "+s1+"   s2 = "+s2);
	}

}
