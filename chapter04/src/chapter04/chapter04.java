package chapter04;

public class chapter04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종");
// 중첩된 반복문에서 바깥족 반복문까지 종료시키려면 반복문에 이름을 붙이고 사
	}

}
