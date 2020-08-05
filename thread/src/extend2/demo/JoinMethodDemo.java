package extend2.demo;

public class JoinMethodDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		MusicTask musicTask=new MusicTask("popMusic");
		VideoTask videoTask=new VideoTask("video");
		
		Thread t1=new Thread(musicTask);
		Thread t2=new Thread(videoTask);
		
		t1.start();
		t2.start();
		
		for (int i=0; i<50; i++) {
			System.out.println("Hi! i am from Main thread and doing my job");
		}
		t1.join();
		t2.join();
		//join() is present inside the Thread class
		//main thread is joining thread t1 and t2
		
		System.out.println("Hi! i am from Main thread and finished execution");
		//this statement is always going to be executed at last
	}

}
