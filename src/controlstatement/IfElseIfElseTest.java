package controlstatement;

import java.util.Scanner;

public class IfElseIfElseTest {
    public static void main(String[] args){

        int age;
        int charge;

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요 >>");
        age = sc.nextInt();

        if(age < 8){
            charge = 1000;
        }else if(age < 14){
            charge = 2000;

        }else{
            charge = 3000;
        }

        System.out.println("입장료는 " + charge + "원 입니다.");
        sc.close();
    }
}
