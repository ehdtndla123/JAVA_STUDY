package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader=new FileReader("/Users/changdongsoo/test.txt");
		int readCharNo;
		char[] cbuf=new char[4];
		readCharNo=reader.read(cbuf, 1, 2);
		for(int i=0;i<cbuf.length;i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	}

}
