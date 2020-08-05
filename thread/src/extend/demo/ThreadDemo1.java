package extend.demo;

public class ThreadDemo1 extends Thread{
	
	public void run() {
		for (int i=0; i<100; i++) {
		System.out.println("Hey i am from t1 thread"+i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadDemo1 t1 = new ThreadDemo1();//t1 is an object of ThreadDemo1 class this is a new thread
		t1.start();
		
		for (int i=0; i<100; i++) {
			System.out.println("Hi! i am from main thread "+i);
			}
		
	}

}
