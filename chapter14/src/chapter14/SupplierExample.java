package chapter14;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSupplier intsupplier=()->{
			int num=(int)(Math.random()*6)+1;
			return num;
		};
		
		int num=intsupplier.getAsInt();
		System.out.println(num);
	}

}
