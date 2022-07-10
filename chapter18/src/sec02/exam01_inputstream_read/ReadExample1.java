package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("/Users/changdongsoo/test.txt");
		int readByte;
		while((readByte=is.read())!=-1) {
			System.out.println(readByte);
		}
		is.close();
	}

}
