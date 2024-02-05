package structuraldesign.resource.bridge;

public class BridgePattern {
    public static void main(String[] args) {
        Sender emailSender = new EmailSender();
        emailSender.setSenderId("Rohit");
        Message messageViaEmail = new Email(emailSender,"Hi, How Are You?");

        messageViaEmail.printMessage();

        Sender smsSender = new SmsSender();
        smsSender.setSenderId("Suresh");
        Message messageViaSms = new Sms(smsSender,"I am good!");

        messageViaSms.printMessage();

    }
}
