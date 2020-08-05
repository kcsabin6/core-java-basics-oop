package oops.core.java;

public class FrogFighter extends Frog {
	private boolean danger;
	public String jumpHeight;

	public FrogFighter(String name, String color, float price, boolean danger,String jumpHeight) {
		super(name,color,price);
		this.danger=danger;
		this.jumpHeight=jumpHeight;
		}

}
