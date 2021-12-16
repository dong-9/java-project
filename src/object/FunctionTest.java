package object;

public class FunctionTest {

    static int addNum(int num1, int num2){
        return num1 + num2;
    }

    static void printMessage(String message){
        System.out.println(message);
    }

    static int calcSum(){
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        int plusNum = addNum(20,30);
        System.out.println(plusNum);

        printMessage("HI");

        int total = calcSum();
        System.out.println(total);
    }
}
