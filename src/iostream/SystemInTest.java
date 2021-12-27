package iostream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

    public static void StringInputStream(){
        System.out.println("문자열을 쓰세요");
        InputStreamReader isr = new InputStreamReader(System.in);
        int i;
        try{
            while((i = isr.read()) != '\n'){
                System.out.print((char)i);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StringInputStream();
    }
}
