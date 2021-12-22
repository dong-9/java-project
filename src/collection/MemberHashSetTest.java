package collection;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        memberHashSet.addMember(new Member(1111, "TOM"));
        memberHashSet.addMember(new Member(2222, "KIM"));
        memberHashSet.addMember(new Member(3333, "LEE"));
        memberHashSet.addMember(new Member(4444, "JANG"));

        memberHashSet.showMember();

        memberHashSet.addMember(new Member(3333, "HONG"));
        memberHashSet.showMember();
    }
}
