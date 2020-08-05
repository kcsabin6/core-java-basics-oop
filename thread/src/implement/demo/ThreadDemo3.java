package implement.demo;

public class ThreadDemo3 implements Runnable{
	
	public void run() {
		Thread.currentThread().setName("task thread");
		System.out.println("I am from other "+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
	
		ThreadDemo3 task=new ThreadDemo3();
		Thread t=new Thread(task);
		t.start();
		
		Thread.currentThread().setName(" sabin");
		System.out.println("I am form main thread"+Thread.currentThread().getName());
		
		
	}

}
