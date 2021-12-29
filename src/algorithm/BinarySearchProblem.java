package algorithm;


public class BinarySearchProblem {
    public static void main(String[] args) {

        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
        int target = 83;

        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;
        int tmp = numbers[mid];
        boolean find = false;

        while(left <= right){
            if(target == tmp){
                find = true;
                break;
            }else if(target < tmp){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

            mid = (left + right) / 2;
            tmp = numbers[mid];
        }

        if(find){
            mid++;
            System.out.println("찾는수: " +tmp + " 는" + mid + " 위치에 있음");
        }else {
            System.out.println("찾는수가 없음");
        }

    }
}
