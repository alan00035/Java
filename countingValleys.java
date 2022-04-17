import java.util.Stack;

public class countingValleys {
    
    public static void main(String[] args) {
        int steps =8;
        String path = "UDDDUDUU"; // U is up, D is down;

        char[] c = path.toCharArray();

        Stack<Character> stacks = new Stack<Character>();

        int count =0;

        for(int i =0; i< steps; i++){
            stacks.add(c[i]);
            if(c[0] == 'U'){
           
            }
            else if(c[0] == 'D'){
                if(c[i]=='U' && c[i+1] =='D' )
                 count++;
            }
        }

        System.out.println(count);
            


    }
    
}
