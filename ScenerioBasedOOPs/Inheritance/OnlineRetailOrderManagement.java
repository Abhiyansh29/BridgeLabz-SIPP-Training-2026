class Order {
    protected int orderId;
    protected String orderDate;

    
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayInfo() {
        System.out.println("Order ID       : " + orderId);
        System.out.println("Order Date     : " + orderDate);
        System.out.println("Order Status   : " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date  : " + deliveryDate);
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                1001,
                "23-06-2026",
                "TRK987654321",
                "25-06-2026"
        );

        order.displayInfo();
    }
}