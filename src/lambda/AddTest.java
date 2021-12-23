package lambda;

public class AddTest {
    public static void main(String[] args) {
        int num = 2;
        Add add = (x, y) -> {
            // num = 3; 외부에 있는 지역변수 변경 불가
            return x + y + num;
        };

        System.out.println(add.add(1,2));

        Add parameter = (x, y) -> x + y;
        parameterTest(parameter);

        System.out.println(returnTest().add(22,33));

    }

    public static void parameterTest(Add add){
        System.out.println(add.add(20,30));
    }

    public static Add returnTest(){
        return ((x, y) -> x + y);
    }
}
