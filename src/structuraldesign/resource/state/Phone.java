package structuraldesign.resource.state;

public class Phone {
    private final int ram;
    private State phoneState;
    Phone(int ram){
        this.ram = ram;
        phoneState = new UnlockState(this);
    }

    public void changeState(State state) {
        this.phoneState = state;
    }

    public State getPhoneState() {
        return phoneState;
    }
}
