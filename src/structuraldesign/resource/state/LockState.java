package structuraldesign.resource.state;

public class LockState extends AbstractState{
    LockState(Phone phone) {
        super(phone,"Device is in locked state");
    }

    @Override
    public void lock() {
        System.out.println("phone is locked!");
    }

    @Override
    public void unlock() {
        System.out.println("LOCK --> UNLOCK");
        phone.changeState(new UnlockState(phone));
    }

    @Override
    public void triggerGoogle() {
        System.out.println("phone is locked!");
    }
}
