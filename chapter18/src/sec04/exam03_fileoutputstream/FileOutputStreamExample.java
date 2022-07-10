package sec04.exam03_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "/Users/changdongsoo/Library/Mobile Documents/com~apple~CloudDocs/Downloads/image.jpg";
        String targetFileName = "/Users/changdongsoo/Temp/picture.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) > 0) {
            fos.write(readBytes, 0, readByteNo);
            System.out.println("readByteNo: " + readByteNo);
        }

        fos.flush();
        fis.close();
        fos.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}