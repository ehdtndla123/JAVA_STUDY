package chapter12;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator=new Calculator();
		
		user1 u1=new user1();
		u1.setCalculator(calculator);
		u1.start();
		
		user2 u2=new user2();
		u2.setCalculator(calculator);
		u2.start();
		
	}

}
