package innerclass;

class Outer1 {
    private int num = 10;
    private static int sNum = 20;

    private InnerClass innerClass;

    public Outer1(){
        innerClass = new InnerClass();
    }

    private class InnerClass {
        int iNum = 100;
        // static int sInNum = 500; 사용불가

        void innerTest(){
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    public void usingClass(){
        innerClass.innerTest();
    }
}

public class InstanceInnerTest {
    public static void main(String[] args) {
        Outer1 outerClass = new Outer1();
        outerClass.usingClass();

        // OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        // innerClass.innerTest();
    }
}
