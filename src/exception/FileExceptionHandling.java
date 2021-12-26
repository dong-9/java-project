package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void fileOpen1(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/exception/test.txt");
            System.out.println("Read File");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("No such File");
        }finally {
            if(fis != null){
                try {
                    fis.close();
                    System.out.println("File Close");
                } catch (IOException e) {
                    System.out.println(e);
                    System.out.println("File do not close");
                }
            }
        }
    }

    public static void fileOpen2(){
        try(FileInputStream fis = new FileInputStream("src/exception/test.txt")){
            System.out.println("File Read");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fileOpen1();
        fileOpen2();
        System.out.println("Program End");
    }
}
