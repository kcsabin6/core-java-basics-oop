package extend2.demo;

public class VideoTask implements Runnable {

	String tname;
	public VideoTask(String name) {
		tname=name;	
		
	}
	public void run() {
		System.out.println(tname+" is starting it's execution");
		for (int i=0; i<10; i++) {
			System.out.println("Hi! i am from VideoTask thread "+tname+ " "+i);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
		
	}

}
