package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer integer1, Integer integer2) {
        return integer1 > integer2 ? integer1 : integer2;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(10,2,3,1,5,4)
        );
        int max;

        max = list.stream().reduce(1, (x, y) -> x * y);
        System.out.println(max);

        max = list.stream().reduce(new Reduce()).get();
        System.out.println(max);


    }
}
