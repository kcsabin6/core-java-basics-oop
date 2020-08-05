package practice;

import java.util.Comparator;

public class SortByColor implements Comparator<Dog> {

	
	@Override
	public int compare(Dog d1, Dog d2) {
	return	d1.getColor().compareToIgnoreCase(d2.getColor());
		
	}

}
