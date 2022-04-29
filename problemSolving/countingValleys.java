
import java.util.Stack;

public class countingValleys {
    
    public static void main(String[] args) {
        int steps =8;
        String path = "UDDDUDUU"; // U is up, D is down;

        char[] c = path.toCharArray();

        Stack<Character> stacks = new Stack<Character>();

        int count =0;
        int v=0;
        for(char ch: c){
            if(ch =='U') count++;
            if(ch == 'D') count--;
            if(count ==0 && ch =='U') v++;

        }
        System.out.println(v);
            


    }
    
}
