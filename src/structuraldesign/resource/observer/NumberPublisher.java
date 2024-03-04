package structuraldesign.resource.observer;

import java.util.HashMap;
import java.util.List;

public abstract class NumberPublisher implements Publisher{
    HashMap<String,Subscriber> map = new HashMap<>();

    @Override
    public Publisher registerSubscriber(Subscriber subscriber, String type) {
        map.put(type,subscriber);
        return this;
    }

    @Override
    public Publisher deregisterSubscriber(String type) {
        map.remove(type);
        return this;
    }

    @Override
    public void notifySubscriber(int value) {
        String subscriberType = GetSubscriberType.getType(value);
        if(map.containsKey(subscriberType)) map.get(subscriberType).listener(value);
        else System.out.println("type : "+ subscriberType + "not registered");
    }

    @Override
    public void notifyAllSubscribers() {
       for(Subscriber subscriber : map.values()) {
           subscriber.listener(0);
       }
    }
}
