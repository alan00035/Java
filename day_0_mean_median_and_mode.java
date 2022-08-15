import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class day_0_mean_median_and_mode {
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
        // int total = Integer.parseInt(br.readLine().trim());

        int total = 10;
        // int[] arr = new int[total];
       int[] arr={64630, 11735, 14216, 99233, 14470,4978, 73429, 38120, 51135, 67060};

       int mean = Arrays.stream(arr).sum()/total;
       int median = (arr[total/2] + arr[(total/2)+1])/2;

       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i =0; i<total; i++){
        int value = arr[i];
        if(hm.containsKey(value)){
            hm.put(value, hm.get(value)+1);
        }
        else
            hm.put(value, 1);
       }
       
       System.out.println(hm);
       

      
    }
}

// https://www.hackerrank.com/challenges/s10-basic-statistics/problem?isFullScreen=true