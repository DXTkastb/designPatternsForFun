package structuraldesign.resource.bridge;

public interface Message {
    void sendMessage();
    void printMessage();
}

abstract class MessageType implements Message{

    private final String message;
    private final Sender sender;

    MessageType(Sender sd, String msg){
        sender = sd;
        message = msg;
    }

    public String getMessage() {
        return message;
    }

    public Sender getSender() {
        return sender;
    }

    @Override
    public void printMessage() {
        System.out.println(message);
    }
}
