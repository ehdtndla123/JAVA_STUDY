package chapter07;

public class chapter07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상속받은 객체가 부모 생성사 호출 할때는 super(); 이다
		 * 그리고 매개값이 있다면 super(매개값)
		 */
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		/*
		 * final클스와 final메소드
		 *final클래스는 더이상 상속할 수 없는 클래스 즉 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없다.
		 * 오버라이딩 할 수 없는 final 메소드 
		 */
		
		/*
		 * protected 는 default와 같지만 다른패키지에서는 자식 클래스만 접근을 허용한다.
		 */
		
		/*
		 * 강제타입변환(Casting)
		 * 부모 타입을 자식타입으로 변환한느 것을 말한다. 그렇다고 해서 모든 부모 타입을 자식
		 * 클래스 타입으로 강제 변할 수 있는 것은 아니다. 자식 타입이 부모 타입으로 자동변환한 후 다시 자식 타입
		 * 으로 환할 때 강제 타입 변환ㄴ을 사용할 수 있다.
		 * 
		 * 객체 타입확인할때 instanceof 연산자를 활용 하면된다
		 * boolean result=좌항(객체) instanceof 우항(타입)
		 * 매개값의 타입을 조사할 때 주로 사용된다.
		 * 
		 */
	}

}
