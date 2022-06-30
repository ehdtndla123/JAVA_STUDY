package chapter10;

public class chapter10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 일반 예외
		 *컴파일러 체크 예외라고도 하는데, 자바 소스를 컴파일하는 과정에서 예외 처리 코드가 필요한지 검사하기 
		 *때문이다. 만약 예외 처리 코드가 없다면 컴파일 오류가 발생한다.
		 *
		 * 실행 예외
		 *컴파일하는 과정에서 예외 처리 코드를 검사하지 않는 예외를 말한다. 컴파일 시 예외 처리를 확인하는
		 *차이일 뿐 이다
		 * 자바컴파일러가  체크를 하지 않기 때문에 오로지 개발자의 경험에 의해서 예외 처리 코드를 삽입해야한다
		 * 
		 * NullPointerException
		 * 실행예외이며 이것은 객체 참조가 없는 상태 즉 null 값을 갖는 참조 변수로 객체 접근 연산자인 도트를 사용했을때
		 * 발생한다.
		 * 
		 * 
		 */
	}
		
	public void method1() {
		try {
			method2();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	public void method2() throws ClassNotFoundException{
		Class clazz=Class.forName("jaava.lang.String2");
	}
		/*
		 * 사용자 정의 예외 클래스 선언
		 * API 를 사용할때 예외가 있다면 개발자가 직접 정의해서 만들어야 하므로 사용자 정의 예외라고도한다.
		 * 
		 */
	

}
