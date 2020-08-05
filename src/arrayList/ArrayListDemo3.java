package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		Dog d1 = new Dog("jamy",5,"blue");
		Dog d2 = new Dog("tamy",9,"red");
		Dog d3 = new Dog("kalu",3,"brown");

		ArrayList<Dog> alist = new ArrayList<Dog>();
	
		alist.add(d1);
		alist.add(d2);
		alist.add(d3);
		
		//System.out.println(alist);
		System.out.println("Original");
		for(Dog d: alist) {
			System.out.println(d);
		}
		
		System.out.println("Using default sort using Collections ");
		Collections.sort(alist);
		System.out.println(alist);
		
		System.out.println("after sorting"+alist);
		
		Collections.sort(alist, new SortByNameComparator());
		System.out.println("after using comparator"+alist);
		
		//searching
		Dog d4 = new Dog("tamy",9,"red");
		System.out.println(alist.contains(d4));	//contains internally uses equals() method
		
		Dog d5 = new Dog("tamy",10,"red");
		System.out.println(alist.contains(d5));
	}

}
