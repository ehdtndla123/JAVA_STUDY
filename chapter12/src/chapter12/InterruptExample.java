package chapter12;

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new PrintThread2();
		thread.start();
		
		try {thread.sleep(2000);}catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
