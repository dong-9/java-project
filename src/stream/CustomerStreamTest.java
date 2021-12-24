package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerStreamTest {

    public static void showInfo(List<Customer> list){
        list.stream().forEach(s -> System.out.println(s));
    }

    public static void getCustomerName(List<Customer> list){
        list.stream().map(s -> s.getName()).forEach(n -> System.out.println(n));
    }

    public static int getTotalPrice(List<Customer> list){
        int res = list.stream().mapToInt(s -> s.getPrice()).sum();
        return res;
    }

    public static void getOverAge20(List<Customer> list){
        list.stream()
                .filter(s -> s.getAge() >= 20)
                .map(n -> n.getName())
                .sorted()
                .forEach(k -> System.out.println(k));
    }

    public static <T> void a(List<T> list){
        list.stream().forEach(s -> System.out.println(s));

    }

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>(Arrays.asList(
                new Customer("Kim", 40, 100),
                new Customer("Lee", 20, 100),
                new Customer("Jun", 13, 50)
        ));

        showInfo(customers);
        System.out.println();

        getCustomerName(customers);
        System.out.println();

        System.out.println("Total Price: " + getTotalPrice(customers));

        getOverAge20(customers);
    }
}
