package objectclass;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }

    public static void main(String[] args) {
        Book book = new Book("스파이더맨", "마블");
        System.out.println(book);
    }
}
