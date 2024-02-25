package behaviouraldesign.resource.chainofresponsibility;

public interface ChainNode {
    ChainNode addNextChainNode(ChainNode next);
    void endOfChain();
    void getCurrency(int amount);
}
