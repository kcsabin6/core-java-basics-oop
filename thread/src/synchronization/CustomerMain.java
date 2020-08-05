package synchronization;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerThread customer1 = new CustomerThread("Sabin");
		CustomerThread customer2 = new CustomerThread("prajol");
		
		Thread t1=new Thread(customer1);
		Thread t2=new Thread(customer2);
		
		t1.start();
		t2.start();
		
		/*for (int i=0; i<50; i++) {
			System.out.println("Hi! i am in Mall...iside main thread "+i);
		}*/

	}

}
