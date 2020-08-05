package extend.demo;

public class ArbinThread extends Thread{

	public void run() {
		
		for (int i=0; i<100; i++) {
			System.out.println("Hi! i am from Arbin thread "+i);
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
	}
	
	
	
}
