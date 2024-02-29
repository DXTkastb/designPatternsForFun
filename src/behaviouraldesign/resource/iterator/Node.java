package behaviouraldesign.resource.iterator;

public class Node {
    int value;
    Node left;
    Node right;
    public Node(Node l, Node r, int val) {
        left = l;
        right = r;
        value = val;
    }
}
