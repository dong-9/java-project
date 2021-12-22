package collection;

import java.util.TreeSet;

public class TreeSetTest {

    public static void showAll(TreeSet<Member> members){
        for(Member member : members){
            System.out.println(member);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TreeSet<Member> treeSet = new TreeSet<>();
        treeSet.add(new Member(1111, "TOM"));
        treeSet.add(new Member(3333, "KIM"));
        treeSet.add(new Member(2222, "JUNG"));
        treeSet.add(new Member(4444, "LEE"));

        TreeSetTest.showAll(treeSet);

    }
}
