package behaviouraldesign.resource.iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        Node n15 = new Node(null,null,15);
        Node n2 = new Node(null,null,2);
        Node n6 = new Node(null,n15,6);
        Node n11 = new Node(n6,n2,11);
        Node n1 = new Node(n11,null,1);
        Node n3 = new Node(null,n1,3);
        Node n7 = new Node(n3,null,7);
        Node n5 = new Node(null,n7,5);

        DfsTree tree = new DfsTree(n5);
        Iterator<Node> it = tree.getIterator();
        while ((it.hasNext())) {
            System.out.print(it.next().value+":");
        }
        System.out.println("");
        BfsTree bfsTree = new BfsTree(n5);
        Iterator<Node> it2 = bfsTree.getIterator();
        while (it2.hasNext()) {
            System.out.print(it2.next().value+":");
        }

    }
}
