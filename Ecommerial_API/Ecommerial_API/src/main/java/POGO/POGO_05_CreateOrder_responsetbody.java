package POGO;

import java.util.List;

public class POGO_05_CreateOrder_responsetbody {

    private List<String> orders;

    private List<String> productOrderId;

    private String message;


    public void setOrders(List<String> orders) {
        this.orders = orders;
    }
    public List<String> getOrders() {
        return orders;
    }

    public void setProductOrderId(List<String> productOrderId) {
        this.productOrderId = productOrderId;
    }
    public List<String> getProductOrderId() {
        return productOrderId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
