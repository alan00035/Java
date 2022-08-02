import java.util.HashMap;
import java.util.Map.Entry;

public class super_reduced_string {
    public static void main(String[] args) {
        String str = "aaabccddd";

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
        
        StringBuilder sb = new StringBuilder();

        for(Entry<Character,Integer> entry : hm.entrySet() ){
            if(entry.getValue()%2 ==1){
                sb.append(entry.getKey());
            }
        }

        String ans;
        if(sb.length() ==0)
            ans = "Empty String";
        
        else
            ans = sb.toString();
        

            System.out.println(ans);
        }
}

// https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true