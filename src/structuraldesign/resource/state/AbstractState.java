package structuraldesign.resource.state;

public abstract class AbstractState implements State{
    public Phone phone;
    private final String stateString;
    AbstractState(Phone phone,String stateString) {
        this.phone = phone;
        this.stateString = stateString;
    }
    public void printCurrentState(){
        System.out.println(stateString);
    }
}
