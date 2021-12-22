package collection;

import java.util.*;

public class ArrayListSortTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(9,3,5,4,2,8,10,1));

        Collections.sort(list);
        System.out.println("오름차순: " + list);

        System.out.println("=================");
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("내림차순: " + list);

    }
}
