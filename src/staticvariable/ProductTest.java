package staticvariable;

public class ProductTest {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setName("로봇");
        p1.setPrice(20000);

        Product p2 = new Product();
        p2.setName("인형");
        p2.setPrice(10000);

        p1.showProduct();
        p2.showProduct();
        System.out.println(Product.getSerial());

        Product.setSerial(4);
        System.out.println(Product.getSerial());
    }
}
