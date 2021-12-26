package exception;

public class PasswordTest {
    public static void main(String[] args) {
        Password check = new Password();
        check.checkPassword(null);
        check.checkPassword("abcd");
        check.checkPassword("abcde");
        check.checkPassword("abcde#1");

    }
}
