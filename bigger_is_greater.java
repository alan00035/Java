
public class bigger_is_greater{
    public static void main(String[] args) {
        String w = "dkhc"; //zzzayybbaa
        char[] ch = w.toCharArray();
    
        for(int i =w.length()-1; i>=0; i--){
            if(ch[i]<ch[i+1]){
                char tmp =ch[i];
                ch[i] = ch[i+1];
                ch[i+1] = tmp;
                break; 
            }
            
            // else{
                // System.out.println("no answer");
            // }
        }
        System.out.println(ch);
        

    }

    }



// https://www.hackerrank.com/challenges/bigger-is-greater/problem?isFullScreen=true

// explanation of lexicographical algorithm :  https://www.nayuki.io/page/next-lexicographical-permutation-algorithm

// https://programs.programmingoneonone.com/2021/03/hackerrank-bigger-is-greater-solution.html