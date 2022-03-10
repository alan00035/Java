import java.util.Stack;

import javax.lang.model.util.ElementScanner6;

public class javaStack {
    public static void main(String[] args) {
        String a = "({(){}()})()({(){}()})(){()}"; //true
        String b = "(({()})))";  //false
        String d ="{}()";

        char[] ch= b.toCharArray();

        Stack<Character> stacky = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
           if (!stacky.isEmpty()) {
               switch(a.charAt(i)) {
                   case '}' : if (stacky.peek() == '{') {
                       stacky.pop();
                   } break;
                   case ']' : if (stacky.peek() == '[') {
                       stacky.pop();
                   } break;
                   case ')' : if (stacky.peek() == '(') {
                       stacky.pop();
                   } break;
                   default: stacky.push(a.charAt(i));
             }
           } else {
               stacky.push(a.charAt(i));
           } 
        }
        System.out.println(stacky.isEmpty());
          
    }
}

// reference: https://www.hackerrank.com/challenges/java-stack/forum 
