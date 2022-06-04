import javax.lang.model.util.ElementScanner6;

public class bigger_is_greater{
    public static void main(String[] args) {
        String w = "dcbb"; //zzzayybbaa
        char[] ch = w.toCharArray();
        Character temp =null;    
        String ans = null;   

        int n = w.length()-1;

        while(n>=1 && ch[n-1] >=ch[n])
            n--;
        if(n <=0)
            ans="no answer";
            
        int i = w.length()-1;    


        while(ch[i] <=ch[n-1]) // index -1 out of bounds for length 1
            i--;
        
            temp =ch[n-1];
            ch[n-1] = ch[i];
            ch[i] = temp;

        i= w.length()-1;
        while(n<i){
            {
                temp = ch[n];
                ch[n] = ch[i];
                ch[i] = temp;
                n++;
                i--;
            }
        }

         ans = new String(ch);
         

        System.out.println(ans);
        // System.out.println("b".compareTo("d"));
;
    }
        
    }


// https://www.hackerrank.com/challenges/bigger-is-greater/problem?isFullScreen=true

// explanation of lexicographical algorithm :  https://www.nayuki.io/page/next-lexicographical-permutation-algorithm