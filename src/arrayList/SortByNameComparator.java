package arrayList;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog d1, Dog d2) {
		//int x=d1.name.compareTo(d2.name);
		int x=d2.name.compareTo(d1.name);
		return x;
	}

	
}
