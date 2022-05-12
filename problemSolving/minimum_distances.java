
import java.util.Arrays;
import java.util.List;

public class minimum_distances {
    public static void main(String[] args) {
        Integer[] arr ={7, 1, 3, 4};
        List<Integer> a = Arrays.asList(arr);

        // int max = a.size();
        int max = Integer.MAX_VALUE;
        int distances =0;

        for(int m =0; m<a.size(); m++){
            for(int n =m+1; n<a.size(); n++){
                if (a.get(m).equals(a.get(n))){
                    distances = Math.abs(n-m);
                    if(distances<max){
                        max = distances;
                    }
                    
                }
                
                
            }
            
        }

        // this condition needs to be outside of the loop
        if(max==Integer.MAX_VALUE)   
               max=-1;
        System.out.println(max);
    }
}

// https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true
