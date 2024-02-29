package behaviouraldesign.resource.mediator;

public class AlertDialog implements Dialog{
    @Override
    public void printMessage(String message) {
        System.out.println("ALERT ! : "+message);
    }
}
