import java.util.ArrayList;
import java.util.List;

public class append_and_delete {
    public static void main(String[] args) {
        String s = "y";
        String t = "yu";

        int k =2;

        int gap = Math.abs(s.length()-t.length());

        int step =0;
        
        List index = new ArrayList<>();

        // if(gap <0){
        //     step = s.length()+t.length();
        // }
        // else{
            for(int i =0; i< (s.length()+t.length()-gap)/2; i++){
                    if(s.charAt(i) != t.charAt(i))
                            index.add(i);
                        }

            if(!index.isEmpty())
                step = s.length()+t.length() - (int)index.get(0) *2;
            else 
            
                 if(gap<0){
                    step = s.length()+t.length();
                }
                        

        // }

        System.out.println(step<=k? "Yes":"No");

    }
}

// https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true

