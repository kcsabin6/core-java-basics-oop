package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("mango");
		alist.add("banana");
		alist.add("papaya");
		alist.add("apple");
		alist.add("orange");
		
		System.out.println("For loop:");
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));		}
		
		System.out.println("For each loop:");
		for(String s : alist) {
			System.out.println(s);		}
		
		System.out.println("Iterator :");
		Iterator<String>ite = alist.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());		}

		System.out.println("Sorting:");
		Collections.sort(alist);
		System.out.println(alist);
		
		System.out.println("Searching");
		//String s= "mango";
		boolean b= alist.contains("mango");
		System.out.println(b);
		
	}

}
