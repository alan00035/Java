import java.util.Arrays;
import java.util.List;

public class Insertion_sort_part_1 {
    public static void main(String[] args) {
        // Integer[] arrOrigin ={2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        Integer[] arrOrigin ={2,4, 6, 8, 3};
        int count = arrOrigin.length-2;
        List<Integer> arr = Arrays.asList(arrOrigin);

        int temp = arr.get(count+1);
        
         while( count>=0 && temp < arr.get(count)){
            arr.set(count+1, arr.get(count));
            count--;
            print(arr);
        }
     
        
            arr.set(count+1, temp);
            print(arr);

        }

        static void print(List<Integer> arr){
            for(int c:arr){
                System.out.print(c +" ");
                }
                System.out.println();
        }
   
    }

        


// https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true

