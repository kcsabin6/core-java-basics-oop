package extend.demo;

public class SabinArbinMain extends Thread{
	
	public static void main(String[] args) {
		

	SabinThread t1= new SabinThread();
	ArbinThread t2= new ArbinThread();
	
	t1.start();//this thread will allow parallel execution (internally call run())
	t2.start();//this thread will allow parallel execution (internally call run())
	
	//t1.run();//this will not behave as Thread but will behave as method
	//t2.run();//this will not behave as Thread but will behave as method
	
	for (int i=0; i<100; i++) {
		System.out.println("Hi! i am from Main thread "+i);
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
	
	
	}	
}
