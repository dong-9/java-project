package controlstatement;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.println("숫자를 입력해주세요 >>");
            num = sc.nextInt();
            sum += num;
            System.out.println(sum);
        }while (num != 0);

        sc.close();
    }
}
