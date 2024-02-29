package behaviouraldesign.resource.iterator;

import java.util.Stack;

public class DfsTree implements TreeIterator, Tree{
    public Node root;
    public DfsTree(Node r) {
        root = r;
    }
    @Override
    public Iterator<Node> getIterator() {
        Node curNode = root;
        return new Iterator<Node>() {
            Stack<SpecialNode> stack;
            {
                stack = new Stack<>();
                buildLeftStack(root);
            }
            @Override
            public boolean hasNext() {
                return stack.size()!=0;
            }

            @Override
            public Node next() {
                SpecialNode specialNode = stack.pop();

//                if(specialNode.fromleft) {
//                    buildRightStack(specialNode.node.right);
//                    return specialNode.node;
//                }
//                else {
//                    buildLeftStack(specialNode.node);
//                    return next();
//                }

                /*
                Better approach
                Pop a node,
                pull left subtree stack with root as the right child of popped node
                 */
                buildLeftStack(specialNode.node.right);
                return specialNode.node;
            }

            public void buildLeftStack(Node node){
                if(node == null) return;
                SpecialNode sp = SpecialNode.getInstance(node,true);
                stack.push(sp);
                buildLeftStack(sp.node.left);
            }

            @Deprecated
            public void buildRightStack(Node node) {
                if(node == null) return;
                SpecialNode sp = SpecialNode.getInstance(node,false);
                stack.push(sp);
            }


        };
    }
}

class SpecialNode{
    public boolean fromleft = false;
    public Node node;
    private SpecialNode(Node nodex,boolean fl) {
        node = nodex;
        fromleft = fl;
    }
    public static SpecialNode getInstance(Node node,boolean fl) {
        return new SpecialNode(node,fl);
    }
}
