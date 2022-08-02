import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class super_reduced_string {
    public static void main(String[] args) {
        String str = "aabaccddd";

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i =0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(hm.containsKey(ch)){
               hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        
        for(Entry<Character,Integer> entry : hm.entrySet() ){
            if(entry.getValue()%2 ==1){
                System.out.println(entry.getKey());
            }
        }
            
        }
}

// https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true