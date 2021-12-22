package collection;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        memberHashMap.addMember(new Member(1111, "TOM"));
        memberHashMap.addMember(new Member(3333, "KIM"));
        memberHashMap.addMember(new Member(2222, "LEE"));
        memberHashMap.addMember(new Member(4444, "PARK"));

        memberHashMap.showMember();
        memberHashMap.removeMember(2222);
        memberHashMap.showMember();
    }
}
