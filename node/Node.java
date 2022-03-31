package node;

public class Node<T>{

    private T data;
    private Node next;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(T data, Node nx){
        this.data = data;
        this.next = nx;
    }

}