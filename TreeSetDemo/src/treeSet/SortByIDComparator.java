package treeSet;

import java.util.Comparator;

public class SortByIDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		
		//int x=s2.name.compareTo(s1.name);
		int x = s1.getId()-s2.getId();
		return x;
	}

}