package innerclass;

class Outer2 {
    private int outerNum = 10;
    private static int outerStaticNum = 20;

    static class StaticInner {
        int innerNum = 30;
        static int staticInnerNum = 40;

        void printVariable(){
            // 외부 클래스의 인스턴스 변수 사용 불가
            System.out.println("OuterClass outerStaticNum = " + outerStaticNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("StaticInnerClass staticInnerNum = " + staticInnerNum + "(내부 클래스의 스태틱 변수)");
            System.out.println("StaticInnerClass innerNum = " + innerNum + "(내부 클래스의 인스턴스 변수)");
        }

        static void staticPrintVariable(){
            // 내부 클래스의 인스턴스 변수 사용 불가
            System.out.println("OuterClass outerStaticNum = " + outerStaticNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("StaticInnerClass sInNum = " + staticInnerNum + "(내부 클래스의 스태틱 변수)");
        }
    }
}

public class StaticInnerTest {
    public static void main(String[] args) {
        Outer2.StaticInner.staticPrintVariable();
        System.out.println();

        Outer2.StaticInner staticInner = new Outer2.StaticInner();
        staticInner.printVariable();
    }
}
