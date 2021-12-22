package collection;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();
        memberArrayList.addMember(new Member(1111, "TOM"));
        memberArrayList.addMember(new Member(2222, "PARK"));
        memberArrayList.addMember(new Member(3333, "LEE"));
        memberArrayList.addMember(new Member(4444, "JANG"));

        memberArrayList.showMember();
        System.out.println();

        memberArrayList.removeMember(2222);
        memberArrayList.showMember();
        System.out.println();

        memberArrayList.removeIteratorMember(3333);
        memberArrayList.showMember();
    }
}
