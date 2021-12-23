package innerclass;

class Outer3 {
    int outerNum = 10;
    static int staticOuterNum = 20;

    Runnable getRunnable(final int i){
        final int num = 30;

        class LocalInner implements Runnable {
            int localNum = 40;

            @Override
            public void run() {
                System.out.println("OuterNum: " + outerNum);
                System.out.println("StaticOuterNum: " + staticOuterNum);
                System.out.println("I: " + i);
                System.out.println("Num: " + num);
                System.out.println("LocalNum: " + localNum);
            }
        }
        return new LocalInner();
    }

    String getLocal(){
        class Local {
            public String print(){
                return "Local";
            }
        }
        return new Local().print();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Runnable runnable = outer3.getRunnable(60);
        runnable.run();

        System.out.println(outer3.getLocal());
    }
}
