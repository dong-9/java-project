package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class PersonTest {

    public static void print(List<Person> personList){
        for(Person person : personList){
            System.out.println(person);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(13, "COM"));
        personList.add(new Person(43, "AEE"));
        personList.add(new Person(2, "ZIM"));
        personList.add(new Person(28, "OARK"));
        personList.add(new Person(8, "DANG"));

        PersonTest.print(personList);
        Collections.sort(personList);
        PersonTest.print(personList);

        Collections.sort(personList, new PersonNameDESC());
        PersonTest.print(personList);

        TreeSet<Person> treeSet = new TreeSet<>(new PersonNameDESC());
        treeSet.add(new Person(13, "COM"));
        treeSet.add(new Person(43, "AEE"));
        treeSet.add(new Person(2, "ZIM"));
        treeSet.add(new Person(28, "OARK"));
        treeSet.add(new Person(8, "DANG"));

        System.out.println(treeSet);

    }
}
