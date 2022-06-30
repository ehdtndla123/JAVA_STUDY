package chapter11;

public class chapter11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * API는 라이브러리라고도 부른다.
		 * java.lang 패키지는 자바 프로그램의 기본적인 클래스를 담고 있는 패키지이다.
		 * java.util 패키지는 컬렉션 클래스들이 대부분을 차지한다 arrays calendar date objects stringtokenizer 등등
		 *  
		 *  얕은 복제
		 * 단순히 필드값을 복사해서 객체를 복제하는 것을 말한다. 값 복사만 일어난다.
		 *  
		 *  깊은 복제
		 * 참조하고 있는 객체도 복제하는 을 말한다. 
		 * class가 member일 경우
		 * 
		 * !!!먼저 얕은 복사를 한다
		 * Member cloned=(Member)super.clone();
		 * !!!배열과같은scores를 깊은 복사한다
		 * cloned.scores=Arrays.copyOf(this.scores,this.scores.length);
		 * !!!car를 깊은 복제한다.
		 * cloned.car=new Car(this.car.model);
		 * !!!깊은 복제된 Member 객체를 리턴
		 *  return cloned;
		 *  
		 *  &&&&&문자열을 결합하는 +연산자를 많이 사용하면 할수록 그만큼 string 객체의 수가 늘어나기 때문에
		 *  프로그램 성능을 느리게 하는 요인이 된다. 문자열을 변경하는 작업이 많을 경우에는 
		 *  StringBuffer 또는 StringBuilder 를 사용하는 것이 좋다
		 *  내부 버퍼에 문자열을 저장해두고 그안에서 추가 수정 삭제 작업을 할수 있도록설계되어있다
		 *  
		 */
	}

}
