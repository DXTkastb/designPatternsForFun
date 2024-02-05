package structuraldesign.resource.bridge;

public class Sms extends MessageType{
    Sms(Sender sd, String msg) {
        super(sd, msg);
    }

    @Override
    public void sendMessage() {
        System.out.println("SENDING MESSAGE VIA : SMS\nFROM USER :"+super.getSender().getSenderId()+"\n"+super.getMessage());
    }
}
