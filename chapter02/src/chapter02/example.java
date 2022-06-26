package chapter02;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=123456780;
		int num2=123456780;
		
		float num3=num2;
		num2=(int)num3;
		
		int result=num1-num2;
		System.out.println(result);
		//float 부호(1비트) 지수(8비트) 가수(23비트)
		// 123456780 은 23비트로 표현할수없어서 근사치로 변환
		// double은 가능하다 int 크기보다 크기 떄문에.
	}

}
