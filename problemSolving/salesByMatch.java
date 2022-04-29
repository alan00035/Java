
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class salesByMatch {
    public static void main(String[] args) {
        int n =9;
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        
        Arrays.sort(socks);
        
        // Collections.sort(socks);


        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0; i<n; i++){
            if(hm.containsKey(socks[i])){
                hm.put(socks[i], hm.get(socks[i])+1);
            }
            else
                hm.put(socks[i],1);
        }


        // List<Integer> count = new ArrayList<>();
        int sum1 =0;
        int sum2 =0;

        for(Entry<Integer, Integer> entry : hm.entrySet()){
            int sockNum = entry.getValue();
            if(sockNum >=2)
               if(sockNum %2 ==0)
                  sum1 +=sockNum/2;            
               else if (sockNum%2 !=0)
                   sum2 +=(sockNum-1)/2;
            // count.add(entry.getValue());
        }

        System.out.println(sum1+sum2);
    }
}


// https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_r=next-challenge&h_v=zen