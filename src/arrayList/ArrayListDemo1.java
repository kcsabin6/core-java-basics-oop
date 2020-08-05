package arrayList;

import java.util.ArrayList;
//import java.util.List;

public class ArrayListDemo1 {
public static void main(String[] args) {
	ArrayList alist = new ArrayList();
	//List blist = new ArrayList();
	alist.add("apple");
	alist.add("mango");
	alist.add("banana");
	alist.add(5);
	alist.add("orange");
	alist.add(10);
	
	System.out.println("For Loop : ");
	for(int i=0; i<alist.size(); i++) {
	System.out.println(alist.get(i)); }
	
	System.out.println("For each Loop : ");
	for(Object s:alist) {
	System.out.println(s);	}

}

}
