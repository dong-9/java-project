package collection;

import java.util.HashSet;

public class MemberHashSet {
    private HashSet<Member> members;

    public MemberHashSet(){
        members = new HashSet<>();
    }

    public void addMember(Member member){
        members.add(member);
    }

    public boolean removeMember(int memberId){
        return true;
    }

    public void showMember(){
        for(Member member : members){
            System.out.println(member);
        }
        System.out.println();
    }
}
