package oops.core.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();

		alist.add("apple");
		alist.add("banana");
		alist.add("mango");
		alist.add("pappaya");
		alist.add("lemon");

		/*
		 * for(int i=0; i<alist.size();i++) { System.out.println(alist.get(i)); }
		 */
		System.out.println("Using for-each loop#####");
		for (String s : alist) {
			System.out.println(s);
		}

		System.out.println("Using Iterator#######");
		Iterator<String> ite = alist.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
