import java.util.Arrays;
import java.util.List;

public class _non_divisible_subset {
    public static void main(String[] args) {
        int n =6; int k =9;  
        // Integer[] S={278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};
        // Integer[] S={1,7,2,4};
        Integer[] S ={422346306 ,940894801, 696810740 ,862741861, 85835055, 313720373};
        List<Integer> s = Arrays.asList(S);
        
        //all reminder amount will between 0 to k-1;
       int[] reminder = new int[k];

        for(int i: s){
            reminder[i%k]++;  //same as using hashset, counting total by using index
        }


        //reminder[0] is a special case, if its more than 0, no matter whats the number, it should be only select as 1;
        // if select more than 1, any subarray will be end up divided by k ;
        int maxNumber = reminder[0] >0 ? 1:0;

        //this is handling the pairing, k!=0 => i!=k-i; also i!=k/2;
        // which means between the one that able to pair, select the high frequence side. 
 
        for(int i =1; i<= k/2; i++){
            if(i != k-i) // k!=0
                 maxNumber += Math.max(reminder[i], reminder[k-i]);
            else
                maxNumber++;
        }

        // System.out.println(Arrays.toString(reminder));
        System.out.println(maxNumber);
    }
}

// https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true
