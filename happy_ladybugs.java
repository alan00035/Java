import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import hankerrank.easy.list;

public class happy_ladybugs {
    public static void main(String[] args) {
        String b = "RBY_YBR";
        int length = b.length();

        ArrayList<Character> list = new ArrayList<>();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: b.toCharArray()){
            if(hm.containsKey(ch))
                hm.put(ch, hm.get(ch)+1 );
            else    
                hm.put(ch, 1) ;  
        }

        for(Entry<Character, Integer> entry : hm.entrySet())
              if(entry.getValue().equals(1)){
                 ;
              }
        
        
            
            

        
}
}


// https://www.hackerrank.com/challenges/happy-ladybugs/problem?isFullScreen=true