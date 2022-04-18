import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _formingAMagicSquare {
   public static void main(String[] args) {
        int[] i1 = {4, 5 ,8};
        int[] i2 = {2 ,4, 1};
        int[] i3 = {1 ,9, 7};
    
        List<List<Integer>> s = new ArrayList<>();
        
        s.add(Arrays.stream(i1).boxed().collect(Collectors.toList()));
        s.add(Arrays.stream(i2).boxed().collect(Collectors.toList()));
        s.add(Arrays.stream(i3).boxed().collect(Collectors.toList()));

        System.out.println(magicSquare(s));


   } 

   private static int magicSquare(List<List<Integer>> s){

          int sum1 =0; int sum2 =0; int sum3 = 0; int sum4 =0;
          for(int k=0; k<3; k++){
                sum1 += s.get(0).get(k)+s.get(1).get(k)+s.get(2).get(k);
                sum2 += s.get(k).get(0)+s.get(k).get(1)+s.get(k).get(2);
                sum3 += s.get(k).get(k); 
                sum4 = s.get(0).get(2)+ s.get(1).get(1) + s.get(2).get(0);

          }
        return sum4;
        // List<Integer> new_list = new ArrayList<>();    
    
        // for(int j=0; j<3; j++)
        //     for(int k=0; k<3; k++)
        //     new_list.add(s.get(j).get(k));
 
        // Collections.sort(new_list);  
        // System.out.println(new_list);
        // int[] sumInt = {1,2,3,4,5,6,7,8,9};
    
        // int sum =Arrays.stream(sumInt).sum();
        // System.out.println(sum);

        // int cost =0;
        // for(int i =0; i<9; i++){
        //     int a =new_list.get(i);
        //     int b = sumInt[i];
        //     if( a-b !=0);
        //       cost += Math.abs(a-b);
           
        // }

        // System.out.println(cost);
                    // [1, 2, 4, 4, 5, 6, 6, 7, 8]


        // int sum =new_list.stream().mapToInt(Integer::intValue).sum();

        // int result =45-sum;

    // return cost;
   }
}


// https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true
// https://hackerranksolution.in/formingamagicsquarealgo/