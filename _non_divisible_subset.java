import java.util.Arrays;
import java.util.List;

public class _non_divisible_subset {
    public static void main(String[] args) {
        int n =15; int k =7;  //expect 11
        Integer[] S={278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};
        // Integer[] S={1,7,2,4};
        List<Integer> s = Arrays.asList(S);
        
       int[] reminder = new int[s.size()];

        for(int i: s){
            reminder[i%k] ++;  //same as using hashset, counting total by using index
        }

        //all reminder amount will between 0 to k-1;
        int maxNumber = reminder[0] >0 ? 1:0;

        for(int i =1; i<= k/2; i++){
            if(i != k-i)
            maxNumber += Math.max(reminder[i], reminder[k-i]);
            else
            maxNumber++;
        }

        System.out.println(maxNumber);
    }
}

// https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true
