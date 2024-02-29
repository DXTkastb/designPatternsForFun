package behaviouraldesign.resource.mediator;

public class MediatorImpl implements Mediator{
    @Override
    public void showDialog(Button button, String message) {
        Dialog dialog;
        if(button instanceof AlertButton) {
            // You can also register dialogs to save object creation every time!
            dialog = new CancelDialog();
        }
        else dialog = new AlertDialog();

        createDialog(dialog,message);
    }
    private void createDialog(Dialog dialog, String message) {
        dialog.printMessage(message);
    }
}
