package behaviouraldesign.resource.chainofresponsibility;

abstract public class CurrencyChainNode implements ChainNode {

    private final int currency;
    private ChainNode nextChainNode;

    public CurrencyChainNode(int curr){
        this.currency = curr;
    }

    @Override
    public ChainNode addNextChainNode(ChainNode next) {
        this.nextChainNode = next;
        return next;
    }

    @Override
    public void endOfChain() {
        System.out.println("\nEnd Of Chain");
    }

    @Override
    public void getCurrency(int amount) {
        int notes = (int) amount / currency;
        int left = (int) amount % currency;
        String result = "\n notes of " + currency + ":" + notes;
        System.out.println(result);
        nextChainNode.getCurrency(left);
    }
}
