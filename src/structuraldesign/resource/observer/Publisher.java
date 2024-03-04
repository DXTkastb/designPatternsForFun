package structuraldesign.resource.observer;

public interface Publisher {
    Publisher registerSubscriber(Subscriber subscriber, String type);
    Publisher deregisterSubscriber(String type);
    void notifySubscriber(int value);
    void notifyAllSubscribers();

}
