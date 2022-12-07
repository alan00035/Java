import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class two_characters {
    public static void main(String[] args) {
        String s = "beabeefeab";        
        char[] ch = s.toCharArray();
        String newStr = null;
        
        if(defineChar(s) != 0){
            StringBuilder sb = new StringBuilder(s);
        }
    
    }

    static char defineChar(String str){
        char[] ch = str.toCharArray();
        int x, y;
        for(x=0;x<str.length();x++){
            for(y=x+1;y<str.length()-1; y++){
                if(ch[x]==ch[y]){
                    return ch[x];
                }
            }
        }
        return 0;
    }
}
// https://www.hackerrank.com/challenges/two-characters/problem?isFullScreen=true&h_r=next-challenge&h_v=zen