package node;

import node.*;


public class simpleNode {
    public static void main(String[] args) {
        Node x = new Node<String>("hello", null);
        System.out.println(x.getData());

        Node y = new Node<Integer>(2,x);
        System.out.println(y.getData());




        
    }    
}
