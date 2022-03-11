import java.util.Stack;


public class stack {
    public static void main(String[] args) {
        String a = "({(){}()})()({(){}()})(){()}"; //true
        String b = "(({()})))";  //false
        String d ="{}()";

        char[] ch= b.toCharArray();

        Stack<Character> stacky = new Stack<>();
        for (int i = 0; i < b.length(); i++) {
           if (!stacky.isEmpty()) {
               switch(b.charAt(i)) {
                   case '}' : if (stacky.peek() == '{') {
                       stacky.pop();
                   } break;
                   case ']' : if (stacky.peek() == '[') {
                       stacky.pop();
                   } break;
                   case ')' : if (stacky.peek() == '(') {
                       stacky.pop();
                   } break;
                   default: stacky.push(b.charAt(i));
             }
           } 
           else {
               stacky.push(b.charAt(i));
           } 
        }

        System.out.println(stacky);
        // System.out.println(stacky.isEmpty());
          
    }
}

// reference: https://www.hackerrank.com/challenges/java-stack/forum 
