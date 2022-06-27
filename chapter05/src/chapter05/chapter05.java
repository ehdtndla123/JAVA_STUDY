package chapter05;

public class chapter05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 변수를 미리 선언 후,값들이 나중에 결정되는 상황
		//변수=new 타입[] {0,1,2,3,4,5}
		String[] names=null;
		names=new String[] {"홍길","신용","김자"};

		//값의 목록을 가지고 있지 않지만 향후 값들을 저장할 배열을
		//미리 만들고 싶다면 new연산자로 다음 과같이 배열 객체 생성
		//타입[] 변수=new 타입[길이]
		int[] intArray=new int[5];
		
		//다차원 배열
		int[][] scores=new int[2][3];
		
		
	
	}

}
