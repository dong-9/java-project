package collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, String> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member.getMemberName());
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        return false;
    }

    public void showMember(){
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(hashMap.get(iterator.next()));
        }
        System.out.println();
    }
}
