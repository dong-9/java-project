package inheritance;

public class VIPCustomer extends Customer{

    double saleRatio;
    private String agentId;

    public VIPCustomer(int customerId, String customerName){
        super(customerId, customerName);
        ratio = 0.05;
        saleRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        point += price * ratio;
        return price - (int)(price * ratio);
    }

    public String getAgentId(){
        return agentId;
    }

    public void setAgentId(String agentId){
        this.agentId = agentId;
    }
}
