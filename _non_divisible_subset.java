import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _non_divisible_subset {
    public static void main(String[] args) {
        int n =4; int k =7;
        Integer[] S={278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};
        // Integer[] S={1,7,2,4};
        List<Integer> s = Arrays.asList(S);
        
        List<Integer> newArray = new ArrayList<>();

        int i=0;
        for(; i< (k+1)/2; i++){
            System.out.println(Math.max(s.get(i), s.get(k-i)));
        }
    }

}

// https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true