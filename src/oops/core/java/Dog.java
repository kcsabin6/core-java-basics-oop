package oops.core.java;

import java.io.Serializable;

public class Dog implements Serializable {
	private String name="Jacko";
	private String color="red";
	private int price=90;
	public Dog(){
		System.out.println("@(#(Dog#(#(");
	}
	
   public Dog(String name){
	   System.out.println("@(#(Para Dog#(#(");
		this.name=name;
	}
	
	public void run() {
		System.out.println("Dog is runing!!!!!!!!");
	}
	public void bark() {System.out.println("Dog barks at night!!!");}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
}
