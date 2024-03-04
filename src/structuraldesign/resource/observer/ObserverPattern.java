package structuraldesign.resource.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        NumberPublisher publisher = new NumberPublisher() {};
        Subscriber oddnumbersub = new OddNumberSubscriber();
        Subscriber evennumbersub = new EvenNumberSubscriber();
        publisher.registerSubscriber(oddnumbersub, GetSubscriberType.odd_sub_type_name).registerSubscriber(evennumbersub, GetSubscriberType.even_sub_type_name);
        for(int i = 0; i<10; i++) {
            if (i == 0) publisher.notifyAllSubscribers();
            else publisher.notifySubscriber(i);
            if(i == 5) {
                publisher.deregisterSubscriber(GetSubscriberType.even_sub_type_name);
            }
        }

    }
}
