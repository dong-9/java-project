package datastructure;

import java.util.ArrayList;

public class MyArray {

    int[] arr;
    int count;

    int ARRAY_SIZE;
    public static final int ERROR_CODE = 9999;

    public MyArray(){
        count = 0;
        ARRAY_SIZE = 0;
        arr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        arr = new int[size];
    }

    public void addElement(int num){
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        arr[count++] = num;
    }

    public void insertElement(int position, int num){
        if(position < 0 || position > count) return;

        if(count >= ARRAY_SIZE) return;

        for(int i = count - 1; i >= position; i--){
            arr[i+1] = arr[i];
        }
        arr[position] = num;
        count++;
    }

    public int removeElement(int position){
        if(isEmpty()) return ERROR_CODE;

        for(int i = position; i < count - 1; i++){
            arr[i] = arr[i+1];
        }
        count--;
        return arr[position];
    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        if(count == 0){
            return true;
        }
        return false;
    }

    public void removeAll(){
        for(int i = 0; i < count; i++){
            arr[i] = 0;
        }
        count = 0;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        System.out.println(list);

        System.out.println(list.remove("C"));
    }
}
