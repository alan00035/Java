import javax.lang.model.util.ElementScanner6;

public class bigger_is_greater{
    public static void main(String[] args) {
        String w = "a"; //zzzayybbaa
        char[] ch = w.toCharArray();       

        int n = w.length()-1;

        while(n>=1 && ch[n-1] >=ch[n])
            n--;
            if(n <2){
                System.out.println("no answer");
            }
        int i = w.length()-1;    
        while( ch[i] <=ch[n-1])
            i--;
        // for(i =n; i>1; i--){
            // if(ch[i] > ch[i-1]){
           Character temp =ch[n-1];
            ch[n-1] = ch[i];
            ch[i] = temp;
                //  break;
                // }
        // }

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

        String ans = new String(ch);
         
      
        System.out.println(ch);
        // System.out.println("b".compareTo("d"));
;
    }
        
    }


// https://www.hackerrank.com/challenges/bigger-is-greater/problem?isFullScreen=true

// explanation of lexicographical algorithm :  https://www.nayuki.io/page/next-lexicographical-permutation-algorithm