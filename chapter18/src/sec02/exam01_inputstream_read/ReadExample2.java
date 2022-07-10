package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("/Users/changdongsoo/test.txt");
		int readByteNo;
		byte[] readBytes=new byte[3];
		String data="";
		while((readByteNo=is.read(readBytes))!=-1) {
			data+=new String(readBytes,0,readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
