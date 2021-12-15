package operation;

public class LogicalTest {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;

        boolean value = (num1 < 5) && (num2 < 11);
        System.out.println(value);

        value = (num1 < 5) || (num2 < 11);
        System.out.println(value);


    }
}
