package collection;

public class Member implements Comparable<Member>{
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            if(this.memberId == ((Member) obj).memberId){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Member member) {
        if(this.memberId > member.getMemberId()){
            return 1;
        }else if(this.memberId < member.getMemberId()){
            return -1;
        }
        return 0;
    }
}
