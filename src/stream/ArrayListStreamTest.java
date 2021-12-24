package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList(
                "TOM"
                ,"PARK"
                ,"LEE"
        ));

        Stream<String> stringStream = stringList.stream();
        stringStream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        stringList.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        stringList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + " "));
        System.out.println();

        stringList.stream().filter(s -> s.length() >= 4).forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3));
        int sum = integerList.stream().mapToInt(c -> c.intValue()).sum();
        System.out.println(sum);
    }
}
