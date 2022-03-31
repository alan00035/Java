package node;

import java.util.ArrayList;

public class Node<T>{

    private T data;
    // private Node next;
    private ArrayList<Node> neigbors;

    Node(T date){
        this.data = data;
        neigbors=new ArrayList<Node>();
    }


    public T getData() {return this.data;}

    public void setData(T data) {this.data = data;}


    //  use arraylist to get neghbours node

    

    // public Node getNext() {
    //     return this.next;
    // }

    // public void setNext(Node next) {
    //     this.next = next;
    // }

    // public Node(T data, Node nx){
    //     this.data = data;
    //     this.next = nx;
    // }


    



}