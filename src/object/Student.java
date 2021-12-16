package object;

public class Student {
    int studentId;
    String studentName;
    String address;

    Subject korea;
    Subject math;

    public Student(){}


    public Student(int studentId, String studentName, String address){
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;

        korea = new Subject();
        math = new Subject();
    }

    public void showStudentInfo(){
        System.out.println(studentName + "님의 학번은 " + studentId + " 이고 주소는 " + address + " 입니다.");
    }

    public String getStudentName(){
        return  studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public void setSubjectKorea(String subjectName, int score){
        korea.subjectName = subjectName;
        korea.score = score;
    }

    public void setSubjectMath(String subjectName, int score){
        math.subjectName = subjectName;
        math.score = score;
    }

    public Student a(){
        return this;
    }
}
