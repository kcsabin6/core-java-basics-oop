package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DogMain {

	public static void main(String[] args) {
		
		Dog d1= new Dog("tamy",9,"white");
		Dog d2= new Dog("amy",5,"black");
		Dog d3= new Dog("ty",2,"brown");

		
		ArrayList<Dog> alist = new ArrayList<Dog>();
		
		alist.add(d1);
		alist.add(d2);
		alist.add(d3);
		
		System.out.println("Using Iterator");
		Iterator ite =alist.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		System.out.println("Using Collections default by name");
		Collections.sort(alist);
		System.out.println(alist);
		
		System.out.println("Using Collections by color");
		Collections.sort(alist, new SortByColor());
		System.out.println(alist);
		
		
	}

}
