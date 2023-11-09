package Observer;

public class CustomerNotifier implements OrderPlacedSubscriber{

    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.addSubscriber(this);
    }

    @Override
    public ReturnDate orderPlaceEvent() {
        ReturnDate returnDate = new ReturnDate("Customer Notification done");
        System.out.println("Customer Notification done");
        return returnDate;
    }
}
