package synchronization;

public class TrailRoom {
	synchronized static void trail(String tname) {
		
		System.out.println("Hi! i am inside ...my name is "+tname);
		for (int i=0; i<50; i++) {
			System.out.println("Hi! i am inside TrailRoom...please wait outside "+i);
			
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
		
		
		
	}

}
