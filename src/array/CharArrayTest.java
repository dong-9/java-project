package array;

public class CharArrayTest {
    public static void main(String[] args){

        char[] alpah = new char[26];
        char ch = 'A';

        for(int i = 0; i < alpah.length; i++){
            alpah[i] = ch++;
        }

        for(char c : alpah){
            System.out.print(c + " ");
        }
    }
}
