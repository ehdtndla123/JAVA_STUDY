package chapter08;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar=new Car();
		
		myCar.run();
		
		myCar.frontLeftTire=new KumhoTire();
		myCar.frontRightTire=new KumhoTire();
		
		myCar.run();
	}

}
