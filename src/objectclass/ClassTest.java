package objectclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class c = Class.forName("java.lang.String");
        //Class c = Class.forName("java.sql.DriverManager");

        Constructor<String>[] cons = c.getConstructors();
        for(Constructor con : cons){
            System.out.println(con);
        }

        System.out.println();

        Method[] methods = c.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }
    }
}
