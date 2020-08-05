package oops.core.java;

import java.util.ArrayList;

//import java.util.List;
//Creating Array for Custom Class (User defined Class)
public class ArrayListDemo3 {

	public static void main(String[] args) {
		Pig p1 = new Pig("jacky", 5, "black");
		Pig p2 = new Pig("sweety", 2, "white");
		Pig p3 = new Pig("manyr", 9, "brown");

		// List<Pig> alist = new ArrayList<Pig>();
		ArrayList<Pig> alist = new ArrayList<Pig>();
		alist.add(p1);
		alist.add(p2);
		alist.add(p3);

		// System.out.println(alist);
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
	}

}
