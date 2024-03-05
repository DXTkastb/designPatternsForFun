package structuraldesign.resource.state;

public class UnlockState extends AbstractState{
    private boolean googleState;
    UnlockState(Phone phone) {
        super(phone,"Device is in unlocked state");
        googleState = false;
    }

    @Override
    public void lock() {
        System.out.println("UNLOCK --> LOCK");
        phone.changeState(new LockState(phone));
    }

    @Override
    public void unlock() {
        System.out.println("phone is unlocked!");
    }

    @Override
    public void triggerGoogle() {
        if(!googleState) {
            System.out.println("opening google");
        }
        else {
            System.out.println("closing google");
        }
        googleState = !googleState;
    }

}
