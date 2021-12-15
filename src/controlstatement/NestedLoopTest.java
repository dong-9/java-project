package controlstatement;

public class NestedLoopTest {
    public static void main(String[] args){

        for(int i = 1; i < 10; i++){
            System.out.println(i + "단");
            for(int j = 1; j < 10; j++){
                System.out.println(i + " X " + j + " = " + i*j);
            }
        }


        int i = 1;
        while(i <= 9){
            int j = 1;
            while(j <= 9){
                System.out.println(i + " X " + j + " = " + i*j);
                j++;
            }
            i++;
        }
    }
}
