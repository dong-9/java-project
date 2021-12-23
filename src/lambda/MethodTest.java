package lambda;

public class MethodTest implements Method{

    Method method;

    public MethodTest(Method method){
        this.method = method;
    }

    @Override
    public void test() {
        if(method != null) method.test();
    }

    public static void main(String[] args) {

        MethodTest a = new MethodTest(new Method() {
            @Override
            public void test() {
                System.out.println("No Lambda");
            }
        });

        a.test();

        MethodTest b = new MethodTest(() -> {
            System.out.println("Lambda1");
        });

        b.test();

        Method method = () -> System.out.println("Lambda2");
        MethodTest c = new MethodTest(method);
        c.test();

    }
}
