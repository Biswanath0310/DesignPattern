package Observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance();
        CustomerNotifier customerNotifier = new CustomerNotifier();
        WMSNotifier wmsNotifier = new WMSNotifier();
        a.orderPlaced();
        a.removeSubscriber(customerNotifier);
        a.orderPlaced();
    }
}
