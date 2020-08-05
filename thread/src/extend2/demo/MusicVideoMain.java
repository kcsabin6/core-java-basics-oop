package extend2.demo;

public class MusicVideoMain {
	
	public static void main(String[] args) {
		
	MusicTask m1=new MusicTask("rockmusic");
	VideoTask v1=new VideoTask("hdvideo");
	
	Thread t1= new Thread(m1);
	Thread t2= new Thread(v1);
	
	t1.start();
	t2.start();
	
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
