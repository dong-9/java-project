package stream;

import java.util.Arrays;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] ar = {5,1,3,2,4};
        Arrays.stream(ar).forEach(n -> System.out.print(n + " "));
        int sum = Arrays.stream(ar).sum();
        long count = Arrays.stream(ar).count();

        System.out.println(sum);
        System.out.println(count);
    }
}
