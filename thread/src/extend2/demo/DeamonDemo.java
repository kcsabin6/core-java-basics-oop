package extend2.demo;

public class DeamonDemo {
//main thread in non-deamon thread
//you can not convert the status of main thread from non-deamon to deamon
//once non deamon thread terminate then deamon threads must also terminate
	public static void main(String[] args) {
		MusicTask musicTask=new MusicTask("popMusic");
		VideoTask videoTask=new VideoTask("video");
		//we can not call start() method on above instances because musictask and videotask are not threads
		Thread t1=new Thread(musicTask);
		Thread t2=new Thread(videoTask);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("Hi! i am from Main thread "+i);
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			}

	}

}
