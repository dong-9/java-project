package interfacetest;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookShelf = new BookShelf();
        bookShelf.enQueue("SpiderMan1");
        bookShelf.enQueue("SpiderMan2");
        bookShelf.enQueue("SpiderMan3");

        System.out.println("Size :" + bookShelf.getSize());

        System.out.println(bookShelf.deQueue());

        System.out.println("Size :" + bookShelf.getSize());

        BookShelf shelf = (BookShelf) bookShelf;
        System.out.println(shelf.getShelf());
    }
}
