package treeSet;

//import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("sabin",2,300.22);
		Employee e2 = new Employee("prabh",4,200.22);
		Employee e3 = new Employee("nagen",1,400.22);
		Employee e4 = new Employee("mahesh",3,150.22);
		Employee e5 = new Employee("gokul",8,250.22);
		Employee e6 = new Employee("amit",5,350.22);
		
		//Set<Employee> tset = new TreeSet<Employee>(); //default sorting by name
		//Set<Employee> tset = new TreeSet<Employee>(new SortByIDComparator());
		Set<Employee> tset = new TreeSet<Employee>(new SortBySalaryComparator()); 
		
		tset.add(e1);
		tset.add(e2);
		tset.add(e3);
		tset.add(e4);
		tset.add(e5);
		tset.add(e6);
		
		Iterator<Employee> it = tset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	//	Collections.sort(tset,new SortBySalaryComparator());
	//	 System.out.println("after using comparator"+tset);
		 

	}

}
