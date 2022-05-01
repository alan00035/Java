import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import hankerrank.easy.hashset;
import hankerrank.easy.list;

public class non_divisible_subset {
    public static void main(String[] args) {
        int n =4; int k =4;
        // int[] S ={278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};

        int[] S={19,10,12,10,24,25,22};
        HashSet<Integer> hs = new HashSet<>();

        int i =0;
        for(; i<S.length; i++){
           for(int m =0; m<S.length; ++m){
               int a = S[i];
               int b = S[m];
               if(a!=b && (a+b)%k !=0 ){
                // System.out.println(a + "------" +b+ "=======" +(a+b)%k);
                // System.out.println(a);
                hs.add(a);
               }
                
           }
        }
        // System.out.println(list);
        System.out.println(hs);
        // System.out.println(hs.size());

    }
}

// https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true