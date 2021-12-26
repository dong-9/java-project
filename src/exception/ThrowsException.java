package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowsException throwsException = new ThrowsException();
        try {
            throwsException.loadClass("src/exception/test.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
