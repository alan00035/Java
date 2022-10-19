import java.util.Arrays;
import java.util.List;

public class Insertion_sort_part_1 {
    public static void main(String[] args) {
        Integer[] arrOrigin ={2,4,6,8,3};
        int n = arrOrigin.length;
        List<Integer> arr = Arrays.asList(arrOrigin);

        int i;
        for(i=n-1; i>=0; i--){
            int temp = arr.get(i);
            // System.out.println(temp);
            if(temp <arr.get(i)){
                arr.set(i, arr.get(i));
                
            }

           
        }
    }
}

// https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true