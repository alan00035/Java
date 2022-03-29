public class visitorPattern {
    public static void main(String[] args) {
        
    }
    
}


abstract class Tree{
    private int value;
    private Color color;
    private int depth;

    Tree(){};
    Tree(int value, Color color, int depth){
        super();
        this.value=value;
        this.color=color;
        this.depth=depth;
    };
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

  
}

enum Color{
    RED, GREEN
}
// https://www.hackerrank.com/challenges/java-vistor-pattern/problem?isFullScreen=true