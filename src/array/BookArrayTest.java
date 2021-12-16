package array;

public class BookArrayTest {
    public static void main(String[] args){

        Book[] books = new Book[3];
        Book[] copyBooks = new Book[3];

        for(Book book : books){
            System.out.println(book);
        }

        books[0] = new Book("슈퍼맨1", "마블");
        books[1] = new Book("슈퍼맨2", "마블");
        books[2] = new Book("슈퍼맨3", "마블");

        for(Book book : books){
            System.out.println(book + " 제목: " + book.getTitle() + " 저자: " + book.getAuthor());
        }

        System.out.println();
        System.arraycopy(books, 0, copyBooks, 0,3);
        copyBooks[0].setTitle("아이언맨1");
        copyBooks[0].setAuthor("마블");

        for(Book book : books){
            System.out.println(book + " 제목: " + book.getTitle() + " 저자: " + book.getAuthor());
        }

    }
}
