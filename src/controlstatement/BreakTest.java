package controlstatement;

public class BreakTest {
    public static void main(String[] args){

        int num;
        int sum = 0;
        for(num = 1; ; num++){
            sum += num;
            if(sum >= 100){
                break;
            }
        }

        for(num = 1; num <= 50; num++){
            if(num % 3 != 0) continue;
            System.out.println(num);
        }
    }
}
