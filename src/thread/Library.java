package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    public List<String> books;

    public Library(){
        books = new ArrayList<>(Arrays.asList(
          "스파이더맨1", "스파이더맨2"
        ));
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread thread = Thread.currentThread();
        while (books.size() == 0){
            System.out.println(thread.getName() + ": wait start");
            wait();
            System.out.println(thread.getName() + ": wait end");
        }
        if(books.size() > 0){
            String book = books.remove(0);
            System.out.println(thread.getName() + ": " + book + " lend");
            return book;
        }
        return null;
    }

    public synchronized void returnBook(String book){
        Thread thread = Thread.currentThread();
        books.add(book);
        notifyAll();
        System.out.println(thread.getName() + ": " + book + " return");
    }
}
