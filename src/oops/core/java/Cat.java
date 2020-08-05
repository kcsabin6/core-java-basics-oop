package oops.core.java;

public class Cat {

	String name;
	String color;
	int price;
	
	public Cat() {
	
	}
	
	public Cat(String name, String color, int price) {
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
	
	public String toString() {
		return"Cat[name= "+name+" ,color= " +color+ " ,price= "+price+ "]";
		
}
}
