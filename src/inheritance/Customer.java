package inheritance;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int point;
    double ratio;


    public Customer(int customerId, String customerName) {
        customerGrade = "SILVER";
        ratio = 0.01;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public int calcPrice(int price){
        point += price * ratio;
        return price;
    }

    public void showCustomer(){
        System.out.println(customerName + "님의 등급은 " + customerGrade + " 포인트는 " + point);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }
}
