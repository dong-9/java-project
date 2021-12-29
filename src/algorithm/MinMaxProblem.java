package algorithm;

public class MinMaxProblem {
    public static void main(String[] args) {
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int maxNum = numbers[0];
        int minNum = numbers[0];
        int maxPosition = 0;
        int minPosition = 0;
        for(int i = 0; i < numbers.length; i++){
            if(minNum > numbers[i]){
                minNum = numbers[i];
                minPosition = i;
            }

            if(maxNum < numbers[i]){
                maxNum = numbers[i];
                maxPosition = i;
            }
        }

        System.out.println("Min: " + minNum + " Min Position: " + minPosition);
        System.out.println("Max: " + maxNum + " Max Position: " + maxPosition);

    }
}
