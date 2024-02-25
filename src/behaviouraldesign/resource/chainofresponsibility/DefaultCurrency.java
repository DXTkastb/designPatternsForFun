package behaviouraldesign.resource.chainofresponsibility;

public class DefaultCurrency extends CurrencyChainNode{
    public DefaultCurrency(int curr) {
        super(curr);
    }

    @Override
    public void getCurrency(int amount) {
        if(amount != 0) System.out.println("\nunable to process amount :" + amount);;
    }
}
