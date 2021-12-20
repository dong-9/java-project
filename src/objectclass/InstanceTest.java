package objectclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person park = new Person("park");
        System.out.println(park);

        Class c = Class.forName("objectclass.Person");

        Person kim = (Person) c.newInstance();
        kim.setName("park");
        System.out.println(kim);

        Class[] parameterTypes = {String.class};
        Constructor cons = c.getConstructor(parameterTypes);
        Object[] initargs = {"LEE"};
        Person lee = (Person) cons.newInstance(initargs);
        System.out.println(lee);
    }
}
