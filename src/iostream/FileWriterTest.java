package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("src/iostream/writer.txt")){
            fw.write('A');
            char[] buf = {'B', 'C', 'D', 'E'};
            fw.write(buf);
            fw.write("스트링");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
