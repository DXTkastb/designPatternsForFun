package structuraldesign.resource.bridge;

public class SmsSender implements Sender{
    private String senderId;
    @Override
    public void setSenderId(String sender) {
        senderId = sender + "@sms";
    }

    @Override
    public String getSenderId() {
        return senderId;
    }

}
