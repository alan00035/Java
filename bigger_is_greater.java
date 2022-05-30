import javax.lang.model.util.ElementScanner6;

public class bigger_is_greater {
    public static void main(String[] args) {
        String w = "abdc"; //acbd

        char[] ch = w.toCharArray();
        StringBuilder sb = new StringBuilder();
       

        int n = w.length()-1;

        String new_w = null;

        int i,j;char temp=0;
        for(i =n; i>1; i--){
            if(ch[i] > ch[i-1]){
                 temp =ch[i];
                 ch[i] = ch[i-1];
                 ch[i-1] = temp;
                 break;
                }
            else{
                continue;
            }
        }
         
      
        System.out.println(ch);
        // System.out.println("b".compareTo("d"));
;
    }
        
    }


// https://www.hackerrank.com/challenges/bigger-is-greater/problem?isFullScreen=true
