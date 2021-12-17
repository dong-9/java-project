package inheritance;

public class GoldCustomer extends Customer{

    double saleRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "GOLD";
        ratio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        point += price * ratio;
        return price - (int)(price * ratio);
    }
}
