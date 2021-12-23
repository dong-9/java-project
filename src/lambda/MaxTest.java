package lambda;

public class MaxTest {
    public static void main(String[] args) {

        Max max = (x, y) -> (x > y) ? x : y;
        System.out.println(max.getMaxNum(20,30));
    }
}
