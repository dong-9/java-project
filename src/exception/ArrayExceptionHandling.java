package exception;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};

        try {
            for(int i = 0; i <= 5; i++){
                System.out.print(ar[i]);
            }
            System.out.println();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("정상적으로 종료");
    }
}