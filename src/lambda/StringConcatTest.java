package lambda;

public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString("ABC","123");

        StringConcat lambdaConcat = (x, y) -> System.out.println(x + "-" + y);
        lambdaConcat.makeString("ABC", "123");

        // 내부적으로 익명객체를 생성함
        StringConcat anonymousClass = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "-" + s2);
            }
        };

        anonymousClass.makeString("ABC", "123");
    }
}
