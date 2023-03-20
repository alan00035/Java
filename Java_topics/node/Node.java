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
    public Node[] getNeigbors(){
        return neigbors.toArray(new Node[0]);

    }

    public void setNeigbors(Node[] d){
        for(Node i : d){
            neigbors.add(i);
        }
    }


}