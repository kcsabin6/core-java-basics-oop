package treeSet;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		
		int x=s1.getName().compareTo(s2.getName());
		//int x = s1.salary-s2.salary;
		return x;
	}

}
