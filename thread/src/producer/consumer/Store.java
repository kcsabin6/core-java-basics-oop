package producer.consumer;

public class Store {
	private String msg;

	synchronized void addMsg(String msg) {
		while(this.msg != null) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		this.msg=msg;
		notify();
		
	}
	
	
	synchronized String readMsg() {
		while(this.msg == null) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		String temp=this.msg;
		this.msg=null;
		notify();
		return temp;
	}
	
	

}
