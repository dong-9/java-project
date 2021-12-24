package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
    static List<Customer> customers = Arrays.asList(
            new Customer("tom", 10, 200),
            new Customer("kim", 30, 100),
            new Customer("jun", 20, 200)
    );

    public static void sorted(List<Integer> list){
        list.stream().sorted().forEach(s -> System.out.print(s + " "));
    }

    public static void reverse(List<Integer> list){
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    }

    public static void distinct(List<Integer> list){
        list.stream().distinct().forEach(s -> System.out.print(s + " "));
    }

    public static void peek(){
        int sum = IntStream.of(1,3,5,7,9).peek(s -> System.out.print(s + " ")).sum();
        System.out.println("Result: " + sum);
    }

    public static int min(){
        return IntStream.of(1,3,5,7,9).min().getAsInt();
    }

    public static int max(){
        return IntStream.of().max().orElse(0);
    }

    public static int sum(){
        return IntStream.of(1,2,3,4,5).sum();
    }

    public static int count(){
        return (int) IntStream.of(1,2,3,4,5).count();
    }

    public static double avg(){
        return IntStream.of(1,2,3,4,5).average().getAsDouble();
    }

    public static List<String> toList(){
        return customers.stream().map(Customer::getName).collect(Collectors.toList());
    }

    public static String joining(){
        return customers.stream().map(Customer::getName).collect(Collectors.joining(", "));
    }

    public static Map<Integer,List<Customer>> groupingPrice(){
        return customers.stream().collect(Collectors.groupingBy(Customer::getPrice));
    }

    public static Map<Boolean, List<Customer>> partition(){
        return customers.stream().collect(Collectors.partitioningBy(s -> s.getPrice() > 100));
    }

    public static void main(String[] args) {
        sorted(Arrays.asList(3,1,9,2,10,5,4,0));
        System.out.println();

        reverse(Arrays.asList(3,1,9,2,10,5,4,0));
        System.out.println();

        distinct(Arrays.asList(1,1,2,2,3,3));
        System.out.println();

        peek();
        System.out.println("max: " + max());
        System.out.println("min: " + min());
        System.out.println("sum: " + sum());
        System.out.println("count: " + count());
        System.out.println("avg: " + avg());
        System.out.println("toList: " + toList());
        System.out.println("joining: " + joining());
        System.out.println("Grouping: " + groupingPrice());
        System.out.println("Partition: " + partition());
    }
}
