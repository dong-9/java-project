package iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void fileWriteByteOne(){
        try(FileOutputStream fos = new FileOutputStream("src/iostream/output.txt", true)){
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(68);
            fos.write(69);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void fileWriteByteAll(){
        try(FileOutputStream fos = new FileOutputStream("src/iostream/output.txt")){
            byte[] bs = new byte[26];
            byte data = 65;
            for(int i = 0; i < bs.length; i++){
                bs[i] = data++;
            }
            fos.write(bs);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fileWriteByteOne();
        fileWriteByteAll();
    }
}
