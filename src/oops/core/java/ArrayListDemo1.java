package oops.core.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// ArrayList alist = new ArrayList();
		List alist = new ArrayList();
		alist.add(5);
		alist.add("sabin");
		alist.add("mango");
		alist.add("30.77");

		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}

		for (Object s : alist) {
			System.out.println(s);
		}

	}

}