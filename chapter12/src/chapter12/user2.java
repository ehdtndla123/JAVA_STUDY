package chapter12;

public class user2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("user2");
		this.calculator=calculator;
	}
	public void run() {
		calculator.setMemory(50);
	}
}
