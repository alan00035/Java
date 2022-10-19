import java.util.Arrays;
import java.util.List;

public class Insertion_sort_part_1 {
    public static void main(String[] args) {
        Integer[] arrOrigin ={2,4,6,8,3};
        int n = arrOrigin.length-2;
        List<Integer> arr = Arrays.asList(arrOrigin);
        
        int temp = arr.get(n+1);
        int i;
        for(i=n; i>=0; i--){
            // System.out.println(arr.get(i));
            if(temp < arr.get(i)){
                arr.set(i+1, arr.get(i));
                // arr.forEach(System.out::print);
                // System.out.println(arr);

            }
            if(temp >=arr.get(i)){
                arr.set(i+1, temp);
                System.out.println(arr);
                // System.out.println(arr.get(i));
            }
        }
        
    }
}

// https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true
