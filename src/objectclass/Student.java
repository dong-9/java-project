package objectclass;

public class Student implements Cloneable{

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student student = (Student) obj;
            if(this.studentId == student.studentId){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
