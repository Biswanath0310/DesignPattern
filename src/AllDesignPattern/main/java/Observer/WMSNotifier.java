package Observer;

public class WMSNotifier implements OrderPlacedSubscriber{

    public WMSNotifier() {
        Amazon a = Amazon.getInstance();
        a.addSubscriber(this);
    }

    @Override
    public ReturnDate orderPlaceEvent() {
        ReturnDate returnDate = new ReturnDate("WMS notified");
        System.out.println("WMS notified");
        return returnDate;
    }
}
