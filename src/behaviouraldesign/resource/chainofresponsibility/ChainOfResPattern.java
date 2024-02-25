package behaviouraldesign.resource.chainofresponsibility;

public class ChainOfResPattern {
    public static void main(String[] args) {
        ChainNode curreny10 = new Currency10(10);
        ChainNode curreny5 = new Currency5(5);
        ChainNode curreny1 = new Currency1(3);
        curreny10.addNextChainNode(curreny5).addNextChainNode(curreny1).addNextChainNode(new DefaultCurrency(0));

       curreny10.getCurrency(19);

    }
}
