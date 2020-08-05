package oops.core.java;

public class Mouse {
 private String name;
 private String color;
 private int price;
 
 public Mouse() {
	 }

public Mouse(String name, String color, int price) {
	this.name=name;
	this.color=color;
	this.price=price;
	}

public void run() { System.out.println("the mouse is running..");}
public void cry() { System.out.println("the mouse is crying..");}

public String toString() {
return"Mouse[name="+name+",color="+color+",price="+price+"]";
}

/*class DanceMouse extends Mouse{
	public void dance() {
		System.out.println("the mouse is dancing..");
	}
} */
}