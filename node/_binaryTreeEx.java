package node;
import node.Node;

public class _binaryTreeEx {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.addValue(6);
        bt.addValue(4);
        bt.addValue(5);
        bt.addValue(8);
        bt.addValue(1);
        bt.addValue(9);

        System.out.println();
    }
}

class BinaryTree{
    Node root;
   private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }
        else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }
        else{
            return current;
        }

        return current;
    }

    public void addValue(int value){
        addRecursive(root, value);
    }
}

class Node{
    int value;
    Node left;
    Node right;

    Node(int Value){
        this.value=value;
        right =null;
        left =null;
    }

    public char[] getValue() {
        return null;
    }
}