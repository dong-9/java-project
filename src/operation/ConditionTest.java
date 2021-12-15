package operation;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args){

        int max;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요>>");
        int num1 = sc.nextInt();
        System.out.println("숫자를 입력해 주세요>>");
        int num2 = sc.nextInt();
        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        sc.close();
    }
}
