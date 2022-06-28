package chapter06;

public class chapter06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 객체란 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있고
		 * 다른 것과 식별 가능한 것을 말한다.
		 *
		 * 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있다.
		 * 이것을 싱글톤이라 하는데 외부에서 new 연산자로 생자를 호출할 수 없게 해야한다.
		 */
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		if(obj1==obj2) {
			System.out.println("같은 객체 입니다.");
		}
		/*
		 * final 필드의 의미는 최종적이란 뜻 초기값이 저장되면 이것이 최종적인 값 프로그램 실행 도중 수정불가
		 * final 필드 초기값을 줄 수 있는 방법은 두가지다
		 *  첫째, 필드 선언 시에 주는 방법
		 *  둘째, 생성자에서 주는 방법
		 *  상수 == static final
		 */
		
		/*
		 * 어노테이션
		 * 어노테이션은 메타데이터라고 볼 수 있다 메타데이터란 애플리케이션이 처리해야 할 데이터가 아니라 컴파일 과정과
		 * 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지를 알려주는 정보이다.
		 * @AnnotationName
		 */
		}
	}

