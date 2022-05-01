import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cut_the_sticker {
    public static void main(String[] args) {
        Integer[] a ={5, 4, 4, 2, 2, 8};
        List<Integer> arr = Arrays.asList(a);
        int count =0;
           
        Integer sum = arr.stream().reduce(0,Integer:: sum);
            
         
                for(int i=0; i<arr.size(); i++){
                    Collections.sort(arr);
                    int min = arr.get(0);
                    if(arr.get(i)-min >0){
                        count++;
                    }
                }
            
            
    }

}


// https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

// Arrays.sort(array);
        
// System.out.println(array.length);
// for (int i = 1; i < array.length; i++) {
//     if (array[i] != array[i-1]) {
//         System.out.println(array.length - i);
//     }