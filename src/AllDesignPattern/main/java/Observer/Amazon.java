package Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<OrderPlacedSubscriber> subscribers;

    private static Amazon instance;

    private Amazon(){
        this.subscribers = new ArrayList<>();
    }

    public static Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void addSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        subscribers.add(orderPlacedSubscriber);
    }

    public void removeSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        subscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaced(){
        for (OrderPlacedSubscriber s:subscribers) {
            s.orderPlaceEvent();
        }
    }
}
