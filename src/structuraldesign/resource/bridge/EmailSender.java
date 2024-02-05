package structuraldesign.resource.bridge;

public class EmailSender implements  Sender{
    private String senderId;
    @Override
    public void setSenderId(String id) {
        senderId = id + "@email";
    }
    @Override
    public String getSenderId() {
        return senderId;
    }
}
