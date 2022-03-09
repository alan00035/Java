import java.util.Stack;

import javax.lang.model.util.ElementScanner6;

public class javaStack {
    public static void main(String[] args) {
        String a = "{}()";
        String b = "({()})";
        String d = "{}(";

        char[] ch= a.toCharArray();
        int length = a.length();

        Stack<Character> stack = new Stack<>();
      
        for(char c : ch){
            if (c =='{' | c =='[' | c == '('){
                stack.push(c);
            }
            else{
                if(c == '' ){
                    System.out.println(true);
                }
            }
            
            System.out.println(stack);

        }

        System.out.println(stack);

        // System.out.println(a.length());

        // if(length%2 == 0 ){

        //     for(int j=0; j <length; j++){
        //         for(int k=1; k<length; k++) {
        //             if (ch[j] == ch[k]){
                        
        //             }
        //         }
                
        //     }
        //     System.out.println(true);
        // }

    
        // else 
        //   System.out.println("false");

    }
    
}
