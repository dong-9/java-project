package exception;

public class StudentTest {
    public static MyLogger myLogger = MyLogger.getInstance();

    public static String checkName(String name) {
        try {
            Student student = new Student(name);
            return student.getStudentName();
        } catch (StudentException e) {
            myLogger.log(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        checkName(null);
        checkName("김유신홍길동이순신장군");
    }
}
