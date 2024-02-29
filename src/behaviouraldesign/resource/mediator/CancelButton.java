package behaviouraldesign.resource.mediator;

public class CancelButton implements Button{
    private Mediator mediator;
    public CancelButton(Mediator mediator){
        this.mediator = mediator;
    }
    @Override
    public void click(String message) {
        mediator.showDialog(this,message);
    }

}
