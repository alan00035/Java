import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import hankerrank.easy.list;

public class pickingUpNumbers {
    public static void main(String[] args) {
        int [] arr = {1 ,3 ,3 ,4 ,5 ,6};
        
        // List<Integer> sublist = new ArrayList<>();

        // Arrays.sort(arr);
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i :arr){
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);
            else
                hm.put(i, 1);
        }
        
        for(Entry<Integer,Integer> entry : hm.entrySet() ){
            if(entry.getKey()==4)
                System.out.println(entry.getValue());
        }
        

        List<Integer> sum = new ArrayList<>();

        int count =0;

     
    }
        
}

// https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true
