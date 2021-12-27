package iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void fileReadByteOne(){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("src/iostream/input.txt");
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void fileReadByteAll(){
        int i;
        try(FileInputStream fis = new FileInputStream("src/iostream/input.txt")){
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void fileReadByteArray(){
        int i;
        try(FileInputStream fis = new FileInputStream("src/iostream/input.txt")){
            byte[] bs = new byte[10];
            while((i = fis.read(bs)) != -1){
                for(int j = 0; j < i; j++){
                    System.out.print((char)bs[j]);
                }
                System.out.println(" : " + i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fileReadByteOne();
        fileReadByteAll();
        fileReadByteArray();
    }
}
