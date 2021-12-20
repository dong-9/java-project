package objectclass;

public class EqualTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student park1 = new Student(100, "Park");
        Student park2 = park1;
        Student park3 = new Student(100, "Park");

        System.out.println(park1 == park3); // false
        System.out.println(park1 == park2); // true
        System.out.println(park1.equals(park3)); // true

        System.out.println(park1.hashCode()); // 100
        System.out.println(park3.hashCode()); // 100

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1.equals(i2)); // true
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        String a = "abc";
        String b = new String("abc");

        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true


        Student kim1 = new Student(200, "kim");
        Student kim2 = (Student) kim1.clone();

        System.out.println(System.identityHashCode(kim1));
        System.out.println(System.identityHashCode(kim2));
    }
}
