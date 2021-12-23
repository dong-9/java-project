package lambda;

public class PrintStringTest {
    public static void main(String[] args) {

        PrintString printString = str -> System.out.println(str);
        printString.print("Hello");

        printString1(printString);

        printString2().print("Hello World");

    }

    public static void printString1(PrintString printString){
        printString.print("Hello World");
    }

    public static PrintString printString2(){
        return str -> System.out.println(str);
    }
}
