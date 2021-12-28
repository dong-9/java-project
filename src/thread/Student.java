package thread;

public class Student extends Thread {

    public Student(String name){
        super(name);
    }

    @Override
    public void run() {
        try{
            String book = LibraryTest.library.lendBook();
            if(book == null) {
                System.out.println("책이 없습니다.");
                return;
            }
            sleep(5000);
            LibraryTest.library.returnBook(book);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
