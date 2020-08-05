package producer.consumer;

import java.util.Scanner;

public class Producer implements Runnable{
	private Store store;//store is Store type variable/instance 
	
	Producer(Store store){
		this.store=store;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("Enter the msg");
			Scanner scanner=new Scanner(System.in);
			String msg=scanner.nextLine();
			
			store.addMsg(msg);
			try {
			Thread.sleep(700);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
