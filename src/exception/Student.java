package exception;

public class Student {
    private String studentName;

    public Student(String studentName) throws StudentException {
        if(studentName == null){
            throw new StudentException("이름이 비었어요");
        }else if(studentName.length() > 5){
            throw new StudentException("이름이 너무 깁니다.");
        }
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }
}
