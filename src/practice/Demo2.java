package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("apple");
		alist.add("mango");
		alist.add("banana");
		alist.add("pineapple");
		alist.add("orange");
		
		System.out.println("using foreach loop");
		for(String e:alist) {
			System.out.println(alist);
		}
		
		System.out.println("using Collection sort");
		Collections.sort(alist);
		System.out.println(alist);
		
		
		System.out.println("using Iterator");
		Iterator ite =alist.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}
	
	
	
	
	
}
