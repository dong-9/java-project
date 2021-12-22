package collection;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (o1.compareTo(o2)) * -1; // 내림차순
    }
}

public class ComparatorTest {
    public static void main(String[] args) {

        Set<String> ascSet = new TreeSet<>();
        ascSet.add("b");
        ascSet.add("c");
        ascSet.add("a");
        System.out.println(ascSet);

        Set<String> descSet = new TreeSet<>(new MyComparator());
        descSet.add("b");
        descSet.add("c");
        descSet.add("a");
        System.out.println(descSet);
    }
}
