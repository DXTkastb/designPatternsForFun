package behaviouraldesign.resource.mediator;

public class MediatorPattern {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        Button b1 = new AlertButton(mediator);
        Button b2 = new CancelButton(mediator);
        CancelDialog cancelDialog = new CancelDialog();
        AlertDialog alertDialog = new AlertDialog();
        alertDialog.printMessage("dividing by zero");
        cancelDialog.printMessage("cancelling operation");
    }
}
