package sec02.exam03_reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader=new FileReader("/Users/changdongsoo/test.txt");
		int readData;
		while((readData=reader.read())!=-1) {
			System.out.println((char)readData);
		}
		reader.close();
	}

}
