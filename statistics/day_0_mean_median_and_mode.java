package statistics;

import java.util.*;
import java.util.Map.Entry;

public class day_0_mean_median_and_mode {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int count = scan.nextInt();
        // int[] arr = new int[count];

        // while(count -- >0){
        //   arr[count]=scan.nextInt();
        // }


        int max =0;
        int maxValue=0;
        int total = 10;
        // int[] arr = new int[total];
       int[] arr={64630, 11735, 14216, 99233, 14470,4978,73429, 38120, 51135, 67060};

      // List<Integer> arr = Arrays.asList(ar);
      // int mean = arr.stream().mapToInt(Integer::intValue).sum()/total;
      // int median = (arr.get(total/2) + arr.get((total/2) +1) )/2;

       float mean = Arrays.stream(arr).sum()/total;

       Arrays.sort(arr);
       float median = (arr[total/2] + arr[(total/2)-1])/2;

       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i =0; i<total; i++){
        int value = arr [i];
        if(hm.containsKey(value)){
            hm.put(value, hm.get(value)+1);
        }
        else
            hm.put(value, 1);
       }
       for(Entry<Integer, Integer> entry: hm.entrySet()){
         if(entry.getValue() >max)
            max = entry.getValue();
          if(entry.getValue()==max && max !=1)
            maxValue = entry.getKey();
          else if(max ==1)
          //  Collections.sort(arr);
          //  maxValue = arr.get(0);
            Arrays.sort(arr);
            maxValue = arr[0];
       }
      
       System.out.printf("%.1f", mean);
       System.out.println();
       System.out.printf("%.1f", median);
       System.out.println();
       System.out.println(maxValue);
       
       

      
    }
}

// https://www.hackerrank.com/challenges/s10-basic-statistics/problem?isFullScreen=true