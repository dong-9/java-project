package staticvariable;

public class Product {

    private String name;
    private int price;
    private int serialNum;
    private static int serial = 0;

    Product(){
        serial++;
        serialNum = serial;
    }

    public static int getSerial(){
        return serial;
    }

    public static void setSerial(int serial){
        Product.serial = serial;
        // serialNum = serial;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showProduct(){
        System.out.println("Serial: " + serialNum + " NAME: " + name + " PRICE: " + price);
    }
}
