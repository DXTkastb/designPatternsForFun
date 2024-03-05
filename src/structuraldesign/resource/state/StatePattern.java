package structuraldesign.resource.state;

public class StatePattern {
    public static void main(String[] args) {
        Phone phone = new Phone(8000);
        phone.getPhoneState().unlock();
        phone.getPhoneState().lock();
        phone.getPhoneState().lock();
        phone.getPhoneState().printCurrentState();
        phone.getPhoneState().triggerGoogle();
        phone.getPhoneState().unlock();
        phone.getPhoneState().printCurrentState();
        phone.getPhoneState().triggerGoogle();
        phone.getPhoneState().printCurrentState();
        phone.getPhoneState().triggerGoogle();
        phone.getPhoneState().lock();
    }
}
