package datatype;

public class LocalVariableTest {
    public static void main(String[] args){
        var intNum = 10;
        var doubleNum = 10.0;
        var str = "문자열";

        System.out.println(intNum);
        System.out.println(doubleNum);
        System.out.println(str);

        str = "테스트";
        System.out.println(str);

        //str = 123;
    }
}
