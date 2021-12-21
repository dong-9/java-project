package generic;

public class PrinterTest {
    public static void main(String[] args) {

        Printer<Powder> powderPrinter = new Printer<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);

        Powder powder = powderPrinter.getMaterial();
        powder.doPrinting();

        var plasticPrinter = new Printer<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
    }
}
