package node;

import java.util.ArrayList;
import java.util.Stack;

import node.*;


public class simpleNode {
    public static void main(String[] args) {
     Node<String> A = new Node<String>("A");
     Node<String> B = new Node<String>("B");
     Node<String> C = new Node<String>("C");
     Node<String> D = new Node<String>("D");
     Node<String> E = new Node<String>("E");
     Node<String> F = new Node<String>("F");

     A.setNeigbors(new Node[] {A, B, C});
     B.setNeigbors(new Node[] { B, C});
     C.setNeigbors(new Node[] { E,F});
     D.setNeigbors(new Node[] {C,D,E,F});
     E.setNeigbors(new Node[] {C,A});
     F.setNeigbors(new Node[] {B,F});

    new simpleNode().search(A);

    }
    
    
    void search(Node start){

        ArrayList<Node> arr = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(start); 
    
    
        while(!stack.isEmpty()){
            Node current = stack.pop();
            if(!arr.contains(current)){
                System.out.println(current.getData() + ",");
                arr.add(current);
                Node[] neighbors = current.getNeigbors();
                for(int i = neighbors.length-1; i>=0; i--){
                    stack.push(neighbors[i]);
                }
            }
        }
        System.out.println("");
    
        }
    }

