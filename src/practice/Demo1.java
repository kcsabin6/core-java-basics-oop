package practice;

import java.util.ArrayList;

public class Demo1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();
		//ArrayList alist = new ArrayList();
		alist.add("sabin");
		alist.add("prabhat");
		alist.add("sagun");
		alist.add("ryan");
		alist.add("manisha");
		
		System.out.println("Using For loop");
		for(int i=0; i<(alist.size()); i++) {
			System.out.println(alist.get(i));	
			}
		
		
		
		System.out.println("Using Foreach loop");
		for(String e:alist){
			System.out.println(alist);
		}
		
	}
	
	

}
