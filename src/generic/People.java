package generic;

public class People <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        Util util = new Util();

        String name = util.<String>showPeople("TOM");
        Integer age = util.showPeople(23);
        System.out.println(name);
        System.out.println(age);
    }
}
