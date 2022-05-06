import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _non_divisible_subset {
    public static void main(String[] args) {
        int n =15; int k =7;  //expect 11
        Integer[] S={278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};
        // Integer[] S={1,7,2,4};
        List<Integer> s = Arrays.asList(S);
        
        List<Integer> newArray = new ArrayList<>();

        // System.out.println((n+1)/2);
        
        
        // for(int m=0; m<n; m++){
        //     if(s.get(m)%k ==0){
        //         s.remove(m);
        //     }
        // }

        for(int q =0; q<n; q++){
            for(int j=0; j<n && j!=q; j++){
                if(s.get(j)%k ==0 ||s.get(q)%k ==0){
                    System.out.println(s.get(j)+"       "+s.get(q)+"     " +s.get(j)+s.get(q) );

                }
                // if((s.get(j)+s.get(q))%k == 0){
                //     System.out.println(s.get(j)+"       "+s.get(q)+"     " +s.get(j)+s.get(q) );
                // }
                 
            }
        }
        // System.out.println(s);


    }
}

// https://www.hackerrank.com/challenges/non-divisible-subset/problem?isFullScreen=true