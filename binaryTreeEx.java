public class binaryTreeEx {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        b = b.creation();
        
        for(Node n : b){
            System.out.println(n.getValue());
        }
  
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

    public BinaryTree creation(){
        BinaryTree bt = new BinaryTree();
        bt.addValue(6);
        bt.addValue(4);
        bt.addValue(5);
        bt.addValue(8);
        bt.addValue(1);
        bt.addValue(9);

        return bt;
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