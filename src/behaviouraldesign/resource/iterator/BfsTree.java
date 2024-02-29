package behaviouraldesign.resource.iterator;

import java.util.*;

public class BfsTree implements Tree,TreeIterator{
    public Node root;
    public BfsTree(Node root){
        this.root = root;
    }
    @Override
    public Iterator<Node> getIterator() {
        return new Iterator<Node>() {
            Queue<Node> listData = new LinkedList<>();
            {
                listData.add(root);
            }
            @Override
            public boolean hasNext() {
                return listData.size()!=0;
            }

            @Override
            public Node next() {
                Node res = listData.poll();
                if(res.left!=null) listData.add(res.left);
                if(res.right!=null) listData.add(res.right);
                return res;
            }
        };
    }
}
