package inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1111, "TOM"));
        customers.add(new Customer(2222, "PARK"));
        customers.add(new VIPCustomer(3333, "KIM"));
        customers.add(new GoldCustomer(4444, "LEE"));

        for(Customer customer : customers){
            customer.showCustomer();
        }

        for( Customer customer : customers){
            System.out.println(customer.getCustomerName() +" 님이 " +  + customer.calcPrice(10000) + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.point + "점입니다.");
        }

    }
}
