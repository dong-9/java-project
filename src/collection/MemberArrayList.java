package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> members;

    public MemberArrayList(){
        members = new ArrayList<>();
    }

    public MemberArrayList(int size){
        members = new ArrayList<>(size);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public boolean removeMember(int memberId){
        for(int i = 0; i < members.size(); i++){
            if(memberId == members.get(i).getMemberId()){
                members.remove(i);
                return true;
            }
        }
        System.out.println("존재하지 않습니다.");
        return false;
    }

    public boolean removeIteratorMember(int memberId){
        Iterator<Member> iterator = members.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            if(memberId == member.getMemberId()){
                members.remove(member);
                return true;
            }
        }
        return false;
    }

    public void showMember(){
        for(Member member : members){
            System.out.println(member);
        }
    }
}
