package producer.consumer;

public class Consumer implements Runnable{
	
	private Store store;//store is Store type variable/instance 
	
	Consumer(Store store){
		this.store=store;
	}
	
	@Override
	public void run() {
	
		while(true) {
			System.out.println("Message is..."+store.readMsg());
		}
	}

}
