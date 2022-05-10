import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class minimum_distances {
    public static void main(String[] args) {
        Integer[] arr ={7, 1, 3, 4, 1, 7};
        List<Integer> a = Arrays.asList(arr);

        Collections.sort(a, Comparator.reverseOrder());
        int[] count = new int[a.get(0)+1];
        
        List<Integer> list =new ArrayList<>();
        int distances =0;

        for(int n =0; n<a.size(); n++){
            for(int m =n+1; m<a.size() && m!=n; m++){
                int x = a.get(m);
                int y = a.get(n);
                if(x==y){
                    int min = a.size();
                    distances = Math.abs(a.indexOf(x)-a.indexOf(y));
                    System.out.println(distances);
                    // if(distances<min)
                    //     min = distances;

                }
            }
        }
        // System.out.println(distances);
        // for(int i:arr){
        //     count[i]++;
        // }
        
        // for(int i =0; i< a.size(); i++){
        //     if(count[i]==2)
        //         System.out.println(count1.indexOf(i));
        // }



  
        

        // System.out.println(Arrays.toString(count));
    }
}

// https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true