package object;

public class StudentTest {
    public static void main(String[] args){

        Student kim = new Student();
        kim.studentId = 131313;
        kim.studentName = "KIM";
        kim.address = "seoul";

        kim.showStudentInfo();

        kim.setStudentName("김");
        System.out.println("영문에서 한글로 변경 -> " + kim.getStudentName());


        Student park = new Student();
        park.studentId = 141414;
        park.studentName = "PARK";
        park.address = "busan";

        park.showStudentInfo();
        Student constructorTest = new Student(151515, "LEE", "KOREA");
        constructorTest.showStudentInfo();

    }
}
