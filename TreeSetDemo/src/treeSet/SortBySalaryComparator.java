package treeSet;

import java.util.Comparator;

public class SortBySalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		
		//int x=s2.name.compareTo(s1.name);
		int x = (int)(s1.getSalary()-s2.getSalary());
		return x;
	}

}
