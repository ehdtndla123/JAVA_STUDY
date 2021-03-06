package chapter16;

public class chapter16 {
	//중간 처리 메소드와 최종 처리 메소드
	
	/*
	 * 최종 스트림의 집계 전 까지 중간 처리 메소드는 지연된다.
	 * 
	 * 구분 방법 <><>
	 * 리턴 타입을 보면된다
	 * 중간 처리 메소드: 리턴 타입이 스트림
	 * 최종 처리 메소드: 리턴 타입이 기본 메소드거나 OptionalXXX
	 * 
	 */
	
	//리덕션
	
	/*
	 * 대량의 데이터를 가공해서 축소하는 것을 일반적으로 리덕션 이라고한느데 데이터의 합계
	 * 평균값 카운팅 최대값 최소값 등이 대표적인 리덕션의 결과물이라고 볼 수 있다
	 */
	
	//루핑
	
	/*
	 * 루핑ㅇ은 요소 전체를 반복한느 것을 말한다 peek() forEach()가있는데
	 * peek는 중간  처리단계에서 전체 요소를 루핑하면서 추가적인 작업을 하기 위해 사용된다
	 * forEach는 마지막 최종 처리 메소드
	 * 
	 */
	
	//매칭
	
	/*
	 * 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사할 수 있도록 매칭 메소드를 제공하고있다
	 * allMatch anyMatch noneMatch
	 */
	
	//병렬 처리
	
	/*
	 * 멀티 코어 CPU 환경에서 하나의 작업을 분할해서 각각의 코어가 병렬적으로 처리하는 것을 말하는데 목적은
	 * 작업 처리 시간을 줄이기 위한 것이다.
	 */
	
	//포크조인 프레임워크
	
	/*
	 * 병렬 스트림을 이용하면 런타임 시에 포크조인 프레임워크가 동작하는데, 포크 단게에서는 전체 데이터를
	 * 서브 데이터로 분리한다. 그리고 나서 서브 데이터를 멀티 코어에서 병렬로 처리한다.
	 * 조인 단계에서는 서브 결과를 결합해서 최종 결과를 만들어 낸다.
	 * 결론: 병렬 스트림은 요소들을 병렬 처리하기 위해 포크조인 프레임워크를 사용한다.
	 * 
	 */
	
	//병렬 처리 성능
	
	/*
	 * 스트림 병렬 처리가 스트림 순차 처리보다 항상 실행 성능이 좋다고 판단해서는 안된다.
	 * 
	 * 컬렉션에 요소의 수가 적고 요소당 처리 시간이 잛으면 순차 처리가 오히려 병렬 처리보다 빠를 수 있다.
	 * 병렬 처리는 스레드풀 생성, 스레드 생성이라는 추가적인 비용이 발생하기 때문이다.
	 * 
	 * ArrayList,배열은 인덱스로 요소를 관리하기 때문에 포크 단계에서 요소를 쉽게 분리할 수 있어 병렬 처리 시간이 절약
	 * 된다. 반면에 HashSet TreeSet은 요소 분리가 쉽지 않고, LinkedList 역시 링크를 따라가야 하므로 요소 분리가
	 * 쉽지 않다. 따라서 상대적으로 병렬 처리가 늦다
	 * 
	 * 코어수의 영향
	 * 싱글 코어 CPU일 경우에는 순차 처리가 빠르다. 병렬 스트림을 사용할 경우 스레드 수만 증가하고 동시성 작업으로 처리
	 * 하기 때문에 좋지 못한 결과를 준다. 코어의 수가 많으면 많을수록 병렬 작업 처리 속도는 빨라진다.
	 * 
	 */
}
