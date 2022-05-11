import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class service_lane {
    public static void main(String[] args) {
        Integer[] width1 ={1,2,2,2,1};
        Integer[] case1 ={2,4};
        Integer[] case2 ={2,4};

        List<Integer> width = Arrays.asList(width1);
        List<Integer> a= new ArrayList<>();
        
        // for(List<Integer> b : cases){
            List<Integer> sub = width.subList(case1[0], case1[1]+1);
            int min = Integer.MAX_VALUE;
            for(int i : sub){
                if (i<min){
                    min = i;
                }
            }

            // standard sort will change the order of original array, hence use compare to define min value;

            // Collections.sort(sub);  
            // a.add(sub.get(0));
            System.out.println(min);
        }
        
}

// https://www.hackerrank.com/challenges/service-lane/problem?isFullScreen=true