package thread.interrupt;

public class ThreadInterruptExample implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Hi! this is message # "+i);
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Hi I am resumed");
			}
			
			}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadInterruptExample());
		t1.start();
		
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Hi I am resumed main ");
			}
			t1.interrupt();
			
		
		
	}

}
