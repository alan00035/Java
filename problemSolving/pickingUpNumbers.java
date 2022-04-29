
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class pickingUpNumbers {
    public static void main(String[] args) {
        Integer [] arr = {1 ,3 ,3 ,4 ,5 ,6};

        List<Integer> a = Arrays.asList(arr);

        int n = a.size();
        int count =0;

        int frequency[] = new int[101];
        int[] result = new int[101];

        for(int i : a)
         frequency[i]++;

        for(int i=1; i<101; i++)
            result[i]=(frequency[i]+frequency[i-1]);
        
    
        System.out.println(Arrays.stream(result).max().getAsInt());
        
    
        

        // Arrays.sort(arr);
        // HashMap<Integer,Integer> hm = new HashMap<>();

        // for(int i :arr){
        //     if(hm.containsKey(i))
        //         hm.put(i, hm.get(i)+1);
        //     else
        //         hm.put(i, 1);
        // }
        
        // for(Entry<Integer,Integer> entry : hm.entrySet() ){
         
        // }
        


     
    }
        
}

// https://www.hackerrank.com/challenges/picking-numbers/problem?isFullScreen=true

