package implement.demo;


public class ThreadDemo2 implements Runnable{
	
	public void run() {
		
		Thread.currentThread().setName("task thread");
		System.out.println(Thread.currentThread().getName());
		
		/*for (int i=0; i<100; i++) {
		System.out.println("Hey i am from t thread"+i);
		}*/
	}
	
	public static void main(String[] args) {
		
		ThreadDemo2 task = new ThreadDemo2();//task is not an object since it implements Runnable interface
		Thread t = new Thread(task);//t is an object of Thread class this is an thread.
		t.start();
		Thread.currentThread().setName("Sabin thread");
		
		System.out.println(Thread.currentThread().getName());
		
		/*for (int i=0; i<100; i++) {
			System.out.println("Hi! i am from main thread "+i);
			}*/
		
	}

}
