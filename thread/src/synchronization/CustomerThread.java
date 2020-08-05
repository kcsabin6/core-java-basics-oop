package synchronization;

public class CustomerThread implements Runnable{
	
	private String name;
	
	public CustomerThread (String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println("Hey I am inside mall and purchasing clothes "+name);
		TrailRoom.trail(name);
		
	}
	
	

}
