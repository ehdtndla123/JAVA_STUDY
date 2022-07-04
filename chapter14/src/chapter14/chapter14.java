package chapter14;

public class chapter14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//람다식
		
		/* 람다식의 형태는 매개 변수를 가진 코드 블록이지만 런타임 시에는 익명 구현 객체를 생성한다
		 * 람다식 >>> 매개 변수를 가진 코드 블록 >>> 익명 구현 객체
		 * 람다식은 인터페이스 변수에 대입된다. 인터페이스의 익명 구현 객체를 생성한다는 뜻이 된다.
		 * 
		 */
		
		//Operator 함수적 인터페이스
		
		/*
		 * 오퍼레이터 함수적 인터페이스는 function과 동리하게 매개 변수와 리턴값이 있는 applyXXX()메소드를 가지고있다
		 * 하지만 이 메소드들은 매개값을 리턴값으로 매핑하는 역할보다는 매개값을 이용해서 연산을 수행한 후
		 * 동일한 타입으로 리턴값을 제공하는 역할을 한다.
		 */
		
		//Predicate 함수적 인터페이스
		
		/*
		 * predicate 함수적 인터페이스는 매개 변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
		 * 이 메소드들은 매개값을 조사해서 true 또는 false를 리턴하는 역할을 한다.
		 * 
		 */
	}

}
