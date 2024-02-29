package behaviouraldesign.resource.mediator;

public class AlertButton implements  Button{
    private Mediator mediator;
    public AlertButton(Mediator m) {
        this.mediator = m;
    }
    @Override
    public void click(String message) {
        mediator.showDialog(this,message);
    }
}
