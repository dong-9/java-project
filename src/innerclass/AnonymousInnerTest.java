package innerclass;

class Outer4 {

    Runnable getAnonymousRunnable(){
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousRunnable Class");
            }
        };
    }
}

public class AnonymousInnerTest {

    String getName(){
        return "익명클래스 상속";
    }

    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        outer4.getAnonymousRunnable().run();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable이 구현된 익명 클래스 변수");
            }
        };

        runnable.run();


        AnonymousInnerTest a = new AnonymousInnerTest(){

        };
        System.out.println(a.getName());
    }
}
