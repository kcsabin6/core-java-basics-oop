package producer.consumer;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		
		Store st=new Store();
		Producer p=new Producer(st);
		Consumer c=new Consumer(st);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();

	}

}
