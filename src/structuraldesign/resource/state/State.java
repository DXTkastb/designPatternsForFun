package structuraldesign.resource.state;

public interface State {
    void lock();
    void unlock();
    void triggerGoogle();
    public void printCurrentState();
}
