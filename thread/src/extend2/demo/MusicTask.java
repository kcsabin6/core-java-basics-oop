package extend2.demo;

public class MusicTask implements Runnable{
//MusicTask is not a thread...it is a task
	String tname;
	public MusicTask(String name) {
		
		tname=name;
	}
	
	public void run() {
		System.out.println(tname+" starting it's execution");
		for (int i=0; i<10; i++) {
			System.out.println("Hi! i am from MusicTask thread "+tname+" "+i);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}
		
		
		
	}
	

}
