package algorithm;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {80, 50, 70, 10, 60, 20, 40, 30 };
        insertionSort(numbers);
    }

    public static void insertionSort(int[] numbers){

        int tmp = 0;
        int j = 0;
        for(int i = 0; i < numbers.length; i++){

            tmp = numbers[i]; // 50
            j = i;
            while((j > 0) && numbers[j - 1] > tmp){
                numbers[j] = numbers[j - 1];
                j -= 1;
            }
            numbers[j] = tmp;

            for(int a : numbers){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

}
