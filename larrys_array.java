import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class larrys_array {
    public static void main(String[] args) {
        // int[] a = {1,6,5,2,4,3};
        // int[] a ={1,3,4,2};
        int[] a ={1, 2, 3, 5, 4};
        List<Integer> A = new ArrayList<>();
        for(int i:a){
            A.add(i);
        }

        int i;
        for (i =0; i<A.size()-2; i++){
        //  Collections.sort(A.subList(i, i+3));
        
        }

        System.out.println(A);
        
    }

    static List compare(List aList){
        Comparator comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                 return 0;}
                else
                    return 1;
            }
            
        };
        return null;
    }


}

// https://www.hackerrank.com/challenges/larrys-array/problem?isFullScreen=true