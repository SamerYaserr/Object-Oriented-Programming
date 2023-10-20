import java.util.ArrayList;
import java.util.Arrays.*;

public class Order {

    OrderStatus status;
    private String name ;
    private String phoneNumber;
    ArrayList<String> orderItems = new ArrayList();

    public Order(String name, String phoneNumber, ArrayList<String> orderItems) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.orderItems = orderItems;
        this.status = OrderStatus.PENDING;

    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getOrderItems() {

        return orderItems;
    }

    public void setOrderItems(ArrayList<String> orderItems) {
        this.orderItems = orderItems;
    }

    public boolean isDeliverable(){

        if( status == OrderStatus.DELIVERING )
            return true;

        return false;

    }

    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", orderItems=" + orderItems +
                '}';
    }
}
