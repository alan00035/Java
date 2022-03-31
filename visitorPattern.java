import org.w3c.dom.Node;


enum Color{
    RED, GREEN;
}

class Tree{

    int value;
    Color color;
    int depth;

    Tree(int value, Color c, int depth){
        this.value=value;
        this.color=c;
        this.depth=depth;
    }

    int getValue(){
        return value;
    }

    Color getColor(){
        return color;
    }

    int getDepth(){
        return depth;
    }
}

class TreeNode extends Tree{

    TreeNode(int value, Color c, int depth) {
        super(value, c, depth);
        //TODO Auto-generated constructor stub
    }

    public void accept(action visitor){
        visitor.visitNode(this);
    }
}

class TreeLeaf extends Tree{

    TreeLeaf(int value, Color c, int depth) {
        super(value, c, depth);
        //TODO Auto-generated constructor stub
    }

    public void accept(action visitor){
        visitor.visitLeaf(this);
    }

}
abstract class action {
    abstract int getResult();
    abstract void visitNode(TreeNode node);
    abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends action{

    @Override
    int getResult() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    void visitNode(TreeNode node) {
        // TODO Auto-generated method stub
        
    }

    @Override
    void visitLeaf(TreeLeaf leaf) {
        // TODO Auto-generated method stub
        
    }
    
}

class ProductRedNodesVisitor extends action{

    @Override
    int getResult() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    void visitNode(TreeNode node) {
        // TODO Auto-generated method stub
        
    }

    @Override
    void visitLeaf(TreeLeaf leaf) {
        // TODO Auto-generated method stub
        
    }

}

class FancyRedNodesVisitor extends action{

    @Override
    int getResult() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    void visitNode(TreeNode node) {
        // TODO Auto-generated method stub
        
    }

    @Override
    void visitLeaf(TreeLeaf leaf) {
        // TODO Auto-generated method stub
        
    }

}

public class visitorPattern{
    public static void main(String[] args) {
        int nodeNum =5;
        int[] nodeValue = {4,7,2,5,12};
        int[] colorValue ={0,1,0,0,1};  //0 is red, 1 is green
    }
}