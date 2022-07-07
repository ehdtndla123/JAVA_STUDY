package chapter16;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray= {"홍길동","신용권","김미나"};
		Stream<String> strStream=Arrays.stream(strArray);
		strStream.forEach(a->System.out.print(a+","));
		System.out.println();
		
		int[] intArray= {1,2,3,4,5};
		IntStream inStream=Arrays.stream(intArray);
		inStream.forEach(a->System.out.print(a+","));
		System.out.println();
	}

}