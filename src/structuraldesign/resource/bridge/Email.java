package structuraldesign.resource.bridge;

public class Email extends MessageType{
    public Email(Sender sd, String msg) {
        super(sd, msg);
    }

    @Override
    public void sendMessage() {
        System.out.println("SENDING MESSAGE VIA : EMAIL\nFROM USER :"+super.getSender().getSenderId()+"\n"+super.getMessage());
    }

}
