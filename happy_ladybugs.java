import java.util.HashMap;

public class happy_ladybugs {
    public static void main(String[] args) {
        String b = "RBY_YBR";
        int length = b.length();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: b.toCharArray()){
            if(hm.containsKey(ch))
                 hm.put(ch, hm.get(ch)+1 );

        else    
            hm.put(ch, 1) ;  
        }
        
        if(hm.get('_') != null){
            
        }
            
            

        
}
}


// https://www.hackerrank.com/challenges/happy-ladybugs/problem?isFullScreen=true