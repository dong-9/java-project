package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("스파이더맨1", " 마블"));
        books.add(new Book("스파이더맨2", " 마블"));
        books.add(new Book("스파이더맨3", " 마블"));
        books.add(new Book("스파이더맨4", " 마블"));
        books.add(new Book("스파이더맨5", " 마블"));

        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).getTitle() + " Empty ? " + books.isEmpty());
        }
    }

}