package behaviouraldesign.resource.mediator;

public class CancelDialog implements Dialog{
    @Override
    public void printMessage(String message) {
        System.out.println("CANCELLING ! : "+message);
    }
}
