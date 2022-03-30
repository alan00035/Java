import org.w3c.dom.Node;

public class visitorPattern{
    public static void main(String[] args) {

    }
}

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

}

class TreeLeaf extends Tree{

    TreeLeaf(int value, Color c, int depth) {
        super(value, c, depth);
        //TODO Auto-generated constructor stub
    }

}
interface action {
    int getResult();
    void visitNode(TreeNode node);
    void visitLeaf(TreeLeaf leaf);
}